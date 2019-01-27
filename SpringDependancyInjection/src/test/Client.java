package test;


import java.sql.SQLException;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test1;

public class Client {
  
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/springchecking.xml");
        Test1 t1=(Test1) ap.getBean("t");
        t1.printConn();
	}

}
