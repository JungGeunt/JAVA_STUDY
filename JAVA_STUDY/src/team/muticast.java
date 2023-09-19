package team;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class muticast {

	public static void main(String[] args) {
		muticast muticast = new muticast();
		muticast.cl();
		muticast.server();
		
		
	}
	
	
	public void server(){
		InetAddress multicastGroup = null;
		String multicastAddr = "230.0.0.1";
		String Id = "";
		BufferedReader br = null;
		try {
			
			 br = new BufferedReader(new InputStreamReader(System.in));
			 System.out.print("id를 입력하시오 ==> ");
			   Id = br.readLine();
			   System.out.println("*********** " + Id + "님 접속 ***********");
			multicastGroup = InetAddress.getByName(multicastAddr);
			MulticastSocket socket = new MulticastSocket(9000);
			socket.joinGroup(multicastGroup);
			DatagramPacket inPacket;
			byte[] inMsg = null;
			
			while(true) {
				
				inMsg= new byte[1024];
				inPacket = new DatagramPacket(inMsg, inMsg.length);
				socket.receive(inPacket);
				String msg = new String(inMsg , 0 , inPacket.getLength());
				System.out.println(Id + ":"+ msg);
				InetAddress address = inPacket.getAddress();
				int port = inPacket.getPort();
			}
		}catch (Exception e) {
				System.out.println(e.getMessage());
		}
		}
		
		public void cl(){
			
			try {
				//키보드 입력
				BufferedReader sysin = new BufferedReader( new InputStreamReader(System.in));
				InetAddress serverIP = InetAddress.getByName("230.0.0.1"); 
				while(true) {
					//한줄 읽기
					String data = sysin.readLine();
					DatagramSocket dataSocket = new DatagramSocket();
					//문자열을 바이트 배열에 저장 
					byte [] msg1= data.getBytes(); //문자열을 바이 형태로 바꾸어서 저장
					
					//서버로 전송(데이터, 데이터 길이 ,서버 IP , 포트번호)
					DatagramPacket outPacket = new DatagramPacket(msg1, msg1.length ,serverIP , 9000);
					
					dataSocket.send(outPacket);
					//소켓 닫기
					dataSocket.close();
				}
				
			} catch (Exception e) {
					System.out.println(e.getMessage());
			}
			
		}
		}
		

		
			
	


