package day29.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DBConnect {

	//JAVA에 DB연동하기 (Oracle)
	//1.Driver Loading
	//2.DriverManger을 이용하여 Connection 객체 생성
	//3.SQL 작성 (PreparedStatment방식은 SQL을 먼저 작성해야함.)
	//4.PreparedStatment 객체 사용(Statement 객체 대용)
	//5.SQL실행 
	
	//why? PreparedStatment를 사용할까?
	//- SQL에 전달하여 처리하는 값을 변환하는 것이  Statement 까다롭다는점
	//- PreparedStatment는 이것을 간결하게 할 수 있게 작업해줌.
	//- 간단하게 값을 전달할 떄에 SQL에 ? 로 처리하여 값을 지정하고, 변환 처리는 자동으로
	//- ?는 인덱스 값을 사용하여 참조하기 때문에 여러개인겨우 1번부터 순서대로 지정!
	
	
	public static void main(String[] args) {
		// 오라클 DB Connect -- PreparedStatment
		
		// 연결 정보
		 String driver = "oracle.jdbc.driver.OracleDriver";
		 String url="jdbc:oracle:thin:@localhost:1521/XEPDB1"; //thin 오라클의 구분값 
		 String user ="mytest";
		 String password ="mytest";
		 
		 Connection conn =null;
		 PreparedStatement pstmt= null;
		 
		 try {
			//1.드라이버 로드
			Class.forName(driver);
			
			//2. Connection 객체 생성 -DriverManger
			conn= DriverManager.getConnection(url, user, password);
			System.out.println("DB연동 성공");
			
			//3. SQL 작성 -> insert
			String sql = "insert into test(name, age)values(?,?)";
			
			//4. PreparedStatment객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 값을 대입 
			pstmt.setString(1,"testuser" ); //sql 문자가 들어가서 시작을 1번 부터 시작
			pstmt.setInt(2, 20);
			
			//5. SQL 실행
			int result = pstmt.executeUpdate(); //sql인자로 받지 않아요.
			if(result !=0) {
				System.out.println("레코드 추가 성공");
			}else{
				System.out.println("레코드 추가 실패");
			}
			
			String sql2 ="select * from test";
			pstmt= conn.prepareStatement(sql2);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.printf("이름 : %s, 나이 : %d\n", rs.getString("name"), rs.getInt("age"));
			}
			
			//테이블 생성 
			//오라클에 mytest 계정에 Persons 테이블을 생성
			//id,lastname ,firstname, age, city를 가지는 테이블 생성
			//각 테이블에 정보를 입력 받아 데이터를 생성 할 수 있게 만들어 주세요! (id는 자동생성)
			//모든 레코드가 추가가 성공하면, Persons테이블에 있는 레코드 전체를 출력하는 코드를 작성
			
			String sql3 = "insert into Persons (lastName,firstName,age,city) values(?,?,?,?)";
			try {
				 pstmt=conn.prepareStatement(sql3);
				 pstmt.setString(1, "홍");
				 pstmt.setString(2, "길동");
				 pstmt.setInt(3, 20);
				 pstmt.setString(4, "Jeju");
				 result =pstmt.executeUpdate();
				 if(result !=0) {
						System.out.println("레코드 추가 성공");
					}else{
						System.out.println("레코드 추가 실패");
					}
			} catch (SQLException sqle) {
				System.out.println("sql 연동 에러");
				System.out.println(sqle.getMessage());
			}
			
			
			String sql4= "select * from Persons Order by id";
			try {
				pstmt =conn.prepareStatement(sql4);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					System.out.printf("id: %d 성 : %s, 이름 : %s  나이 : %d, 도시 %s\n",
							rs.getInt("id"),
							rs.getString("lastName"), rs.getString("firstName"), 
							rs.getInt("age"),rs.getString("city"));
				}
			} catch (SQLException sqle) {
				System.out.println("SQL연동 오류");
				System.out.println(sqle.getMessage());
				
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		}catch (SQLException sqle) {
			System.out.println("DB연동 실패!");
			System.out.println(sqle.getMessage());
		}
		 
	}

}
