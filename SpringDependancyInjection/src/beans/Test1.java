package beans;
import org.springframework.beans.factory.annotation.Required;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test1 {
	private String driver;
	private String url;
	private String username;
	private String pass;
	@Required
	public void setDriver(String driver) {
		this.driver = driver;
	}
	@Required
	public void setUrl(String url) {
		this.url = url;
	}
	@Required
	public void setUsername(String username) {
		this.username = username;
	}
	@Required
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void printConn() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, username, pass);
		System.out.println(con);
	}

}
