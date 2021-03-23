import java.sql.*;

public class user {
	static String ID;
	static String password;

	public static String getID() {
		return ID;
	}

	public user(String userID,String userPassword) {
		
		this.ID=userID;
		this.password=userPassword;
		
	}
}
