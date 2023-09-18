package day23.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLConnectionEx2 {

	public static void main(String[] args) {
		//URLConnection 예제 2
		URL url = null;
		String address = "https://www.egovframe.go.kr/EgovIntro.jsp?mene=1&submenu=1";
		
		BufferedReader br =null;
		String readline = "";
		
	
		try {
			url = new URL(address); // openStream -> url에 정보를 요청함 -> 그때 받은 정보(바이너리 형태의 정보)를  //아스키코드 => 디코딩해 문자형태로 바꾸는 코드 
			br = new BufferedReader(new InputStreamReader(url.openStream()) //HttpURLConnection 내에 있는 HttpInputstream(바이너리 형태)을 읽어옴 
					);//								get.Content한 값고 동일		/ =>BufferedReader에 집어 넣음 
		while((readline = br.readLine() )!=null) {
			System.out.println(readline); //readLine 한라인씩 읽는 메소드 
		}
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
