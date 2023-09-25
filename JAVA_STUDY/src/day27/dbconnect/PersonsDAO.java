package day27.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class PersonsDAO {
	
	private String url = "jdbc:mariadb://localhost:13306/testdb";		
	private String user = "root";
	private String password = "root1234";
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
public PersonsDAO() {
	try {
		//1. 드라이버 로드
		Class.forName("org.mariadb.jdbc.Driver");
		
		//2. 데이터베이스 연결을 위한 Connetion
		conn=DriverManager.getConnection(url, user, password);
	} catch (ClassNotFoundException ce) {
		System.out.println("드라이버 로드 실패");
		System.out.println(ce.getMessage());
	} catch (SQLException sqle) {
		System.out.println("SQL 연동 실패");
		System.out.println(sqle.getMessage());
	}
}
	//메서드 구현
	//전체 조회
	public List<PersonsVO> allPersons(){
	List<PersonsVO> list = new ArrayList<>();
	String sql = "select * from Persons Order by id desc";
			//데이터 베이스에서 순서가 무조건 정렬해서 나오지 않음 .//  내림차순으로출력  
	try {
		stmt =conn.createStatement();
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			int iD =rs.getInt("id");
			String lastName =rs.getString("lastName");
			String firstName = rs.getString("firstName");
			int age = rs.getInt("age");
			String city = rs.getString("city");
		
	PersonsVO vo = new  PersonsVO(iD, lastName, firstName, age, city);
		list.add(vo);
		}
		
	} catch (SQLException sqle) {
		System.out.println("SQL 연동 실패");
		System.out.println(sqle.getMessage());
	}finally {
		try {
			 if(stmt !=null) stmt.close();
		} catch (Exception e) {}
	}
	 return list;
	}
	
	
 	public PersonsVO select(int id) {
 		
 	String sql = "select * from Persons where id ='" +id+ "'" ;
 	PersonsVO vo = null;
 	try {
 		stmt =conn.createStatement();
		rs = stmt.executeQuery(sql);
		if(rs.next()) {
			vo = new PersonsVO();
			rs.getInt("ID");
			rs.getString("LastName");
			rs.getString("FirstName");
			rs.getInt("Age");
			rs.getString("City");	
		}else {
			System.out.println("입력한  id가 없습니다.");
		}
	} catch (SQLException sqle) {
		System.out.println("SQL 연동 실패");
		System.out.println(sqle.getMessage());
	}finally {
		try {  
			  if(stmt != null)stmt.close();
			  if(rs != null)rs.close();
		} catch (Exception e) {}
	}
 	 return vo;	
 	}
 	
 	public int insert(PersonsVO vo) {
 		int result =0;
 		String sql= "insert into Persons (LastName,FirstName,Age,City)"
 					+ "values('" +vo.getLastName() + "','" + vo.getFirstName()+ "','"
 					+ vo.getAge() + "','" + vo.getCity() + "')" ;	
 		try {
 			stmt =conn.createStatement();
 			result =stmt.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("SQL 연동 에러");
			System.out.println(e.getMessage());
		}finally {
			try { 
				
				if(stmt !=null) stmt.close();
			} catch (Exception e2) {	}
			return result;
		}	
 	}
 	
 	public int Update(PersonsVO vo) {
 		int result =0;
 		
 		String sql = "UPDATE Persons SET LastName = '" + vo.getLastName() 
 								  + "', FirstName = '" + vo.getFirstName() 
 								  + "', Age = " + vo.getAge() 
 								  + ", City = '" + vo.getCity() 
 								  + "' WHERE ID = '" + vo.getID() + "'";
 		
 		try {
 			stmt =conn.createStatement();
			result = stmt.executeUpdate(sql);
			
		} catch (SQLException sqle) {
			 System.out.println("SQL 연동 에러");
		     System.out.println(sqle.getMessage());
		}finally {
	        try {
	            if (stmt != null) stmt.close();  
	           } catch (Exception e2) {}
	    }
		return result;
		}
 	
 	public int delete(int id) {
		int result =0;
		String sql  = "delete from Persons where id = '" +id + "'";
		try {
			stmt =conn.createStatement();
			result = stmt.executeUpdate(sql);
			
		} catch (SQLException sqle) {
			 System.out.println("SQL 연동 에러");
		     System.out.println(sqle.getMessage());
		}finally {
	        try {
	            if (stmt != null) stmt.close();  
	        } catch (Exception e2) {}
	    }
		return result;
	}
 	
 	
 	}


