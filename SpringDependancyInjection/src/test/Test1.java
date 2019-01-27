package test;
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
public class Test1 {

	public static void main(String[] args)throws SQLException {
		BasicDataSource bds= new BasicDataSource();
		bds.setDriverClassName("oracle.jdbc.OracleDriver");
		bds.setUrl("jdbc.oracle:thin:@localhost:1521:xe");
		bds.setPassword("system");
		bds.setUsername("root");
		bds.setMaxTotal(20);
		bds.setMaxIdle(5);
		bds.setMaxWaitMillis(1000*5);
		for(int i=0;i<15;i++) {
		Connection con=	bds.getConnection();
		System.out.println("con"+i);
		}
	}
}
	
