package day23.network;

import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEX {

	public static void main(String[] args) {
		// URLConnection 예제
		
		URL url = null;
		String address = "https://www.egovframe.go.kr/EgovIntro.jsp?mene=1&submenu=1";
		
		try {
			url = new URL(address);   //프록시 - 대리처리(보안)은닉효과 / 캐시서버(특정 값을 저장해 전달해주는 역활) 역활
			URLConnection conn = url.openConnection();
			System.out.println("conn.toString() : " + conn); 
//conn.toString() : sun.net.www.protocol.https.DelegateHttpsURLConnection:https://www.egovframe.go.kr/EgovIntro.jsp?mene=1&submenu=1
			System.out.println("getAllowUserInteraction() : " +conn.getAllowUserInteraction());
			//getAllowUserInteraction() : false 
			System.out.println("getConnectTimeout() : " + conn.getConnectTimeout()); //시간을 선언해주는
			//getConnectTimeout() : 0
			System.out.println("getContent() : " + conn.getContent()); //오브젝트 타입 
			//getContent() : sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@2ea6137
			System.out.println("getContentEncoding() : "+conn.getContentEncoding());
			//getContentEncoding() : null
			System.out.println("getContentLength() : " +conn.getContentLength());
			//getContentLength() : -1 //컨텐츠의 데이터가 없음  //Content는 body부분 말함.
			System.out.println("getContentType : "  +conn.getContentType());
			//getContentType : text/html;charset=UTF-8 //text 형식의 문자열 UTF-8로 이루어져있음
			System.out.println("getDate : " +conn.getDate());
			//getDate : 1694999841000 //시간 정보를 알려줌 밀리초이기 000을 뺴고 생각하면됨 
			System.out.println("getDefaultUseCaches() : "+ conn.getDefaultUseCaches());
			//getDefaultUseCaches() : true 캐시 사용여부
			System.out.println("getDoInput() : "+ conn.getDoInput());
			//getDoInput() : true
			System.out.println("getDoOutput() : "+ conn.getDoOutput());
			//getDoOutput() : false
			System.out.println("getExpiration : " +conn.getExpiration());
			//getExpiration : 0
			System.out.println("getHeaderFields() : " +conn.getHeaderFields());
//getHeaderFields() : {null=[HTTP/1.1 200 OK], transfer-encoding=[chunked], Server=[Server], X-Xss-Protection=[1 ; mode=block], Set-Cookie=[NCPVPCLB=1feb9b653a12806f0ee2ca86ddbeca4c5bda07beceffc7f4c87a83b695da74f8; path=/, NCPVPCLBTG=70920081a6c374a8c77e8e8768a540f74a36d917726afe02b6fbf12b2e6d5609; path=/, scg-lb-id=egovframe-1-1695001233283; Domain=www.egovframe.go.kr; Max-Age=360; Expires=Mon, 18 Sep 2023 01:40:33 GMT, JSESSIONID=F0C1F3FBB69EE83B692F684F0CCCB178.98ba1825384906361103; Path=/; HttpOnly, L-VISITOR=xq4tqsfhqhenl; Max-Age=2147483647; Expires=Sat, 06-Oct-2091 04:48:40 GMT], Vary=[Accept-Encoding], Content-Language=[ko-KR], Date=[Mon, 18 Sep 2023 01:34:33 GMT], Cache-control=[private], Content-Type=[text/html;charset=UTF-8]}			
			System.out.println("getIfModifiedSince() : " +conn.getIfModifiedSince());
			//getIfModifiedSince() : 0
			System.out.println("getLastModifyed() : " +conn.getLastModified());
			//getLastModifyed() : 0
			System.out.println("getReadTimeout() : " +conn.getReadTimeout());
			//getReadTimeout() : 0
			System.out.println("getURL() : " +conn.getURL());
			//getURL() : https://www.egovframe.go.kr/home/sub.do?menuNo=9
			System.out.println("getUseCaches() : "+ conn.getUseCaches());
			//getUseCaches() : true
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
