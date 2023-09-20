package team;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class muticast {

    private static final int MULTICAST_PORT = 9000;
    private static final String MULTICAST_ADDRESS = "230.0.0.1";
    private static final int MAX_MESSAGE_SIZE = 1024;

    private Map<InetAddress, Integer> clients = new HashMap<>();

    public static void main(String[] args) {
        muticast multicastChat = new muticast();
        
        Runnable runnable = new Runnable() {
        	public void run() {
        		muticast muticast = new muticast();
        				muticast.startServer();
        	}
        };
        Runnable runnable2 = new Runnable() {
			@Override
			public void run() {
				muticast muticast = new muticast();
				muticast.startClient();
			}
		};
        
        Thread server = new Thread(runnable);
        
        Thread cl = new Thread(runnable2);
        
        server.start();
        cl.start();
        
    }

    public void startServer() {
        try {
            InetAddress multicastGroup = InetAddress.getByName(MULTICAST_ADDRESS);
            MulticastSocket socket = new MulticastSocket(MULTICAST_PORT);
            socket.joinGroup(multicastGroup);

         

            while (true) {
                byte[] inMsg = new byte[MAX_MESSAGE_SIZE];
                DatagramPacket inPacket = new DatagramPacket(inMsg, inMsg.length);
                socket.receive(inPacket);
                String msg = new String(inMsg, 0, inPacket.getLength());

                InetAddress clientAddress = inPacket.getAddress();
                int clientPort = inPacket.getPort();

                if (!clients.containsKey(clientAddress)) {
                    // New client, add to the list
                    clients.put(clientAddress, clientPort);
                    System.out.println("사용자 " + clientAddress + ":" + clientPort + " 연결됨.");
                }

                // Broadcast the message to all clients
                broadcastMessage(msg, clientAddress, clientPort);
            }
        } catch (Exception e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    public void broadcastMessage(String msg, InetAddress senderAddress, int senderPort) {
        for (Map.Entry<InetAddress, Integer> entry : clients.entrySet()) {
            InetAddress clientAddress = entry.getKey();
            int clientPort = entry.getValue();

            if (!clientAddress.equals(senderAddress) || clientPort != senderPort) {
                try {
                    DatagramSocket dataSocket = new DatagramSocket();
                    byte[] msgBytes = msg.getBytes();
                    DatagramPacket outPacket = new DatagramPacket(msgBytes, msgBytes.length, clientAddress, clientPort);
                    dataSocket.send(outPacket);
                    dataSocket.close();
                } catch (Exception e) {
                    System.out.println("오류 : " + e.getMessage());
                }
            }
        }
    }

    
    
    public void startClient() {
        try {
            BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
            DatagramSocket dataSocket = new DatagramSocket();
            System.out.println("아이디를 입력하세요.");
            System.out.print("아이디: ");
            String id = sysin.readLine();

            InetAddress serverIP = InetAddress.getByName(MULTICAST_ADDRESS);

            while (true) {
                String message = id + ": " + sysin.readLine();
                byte[] msgBytes = message.getBytes();
                DatagramPacket outPacket = new DatagramPacket(msgBytes, msgBytes.length, serverIP, MULTICAST_PORT);
                dataSocket.send(outPacket);
            }
        } catch (Exception e) {
            System.out.println("오류 : " + e.getMessage());
        }
        
        
        
    }
}
