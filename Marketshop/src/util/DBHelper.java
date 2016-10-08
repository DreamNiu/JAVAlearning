package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/** * 连接数据库的工具类 *  * @author Administrator *  */
public class DBHelper {	
	// 驱动字符串	
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";	
	// 指定连接数据库的路径
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";	
	// 用户名	
	private static final String USER = "scott";	
	// 密码	
	private static final String PWD = "tiger";	
	/**	 * 得到与数据库的连接	 * 	 * @return 连接对象	 */	
	public static Connection getConnection() {		
		Connection conn = null;		
		try {			
			Class.forName(DBHelper.DRIVER);			
			conn = DriverManager.getConnection(DBHelper.URL, DBHelper.USER,	DBHelper.PWD);		
			} catch (ClassNotFoundException e) {			
				e.printStackTrace();		
				} catch (SQLException e) {			
					e.printStackTrace();		
					}		
		return conn;
	}
	public static void main(String[] args){
		try{
		    Connection con=DBHelper.getConnection();
		    if(con!=null){
			    System.out.println("连接成功");
		     }
		    else{
			    System.out.println("连接失败");
		    } 
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
