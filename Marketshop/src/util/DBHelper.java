package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/** * �������ݿ�Ĺ����� *  * @author Administrator *  */
public class DBHelper {	
	// �����ַ���	
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";	
	// ָ���������ݿ��·��
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";	
	// �û���	
	private static final String USER = "scott";	
	// ����	
	private static final String PWD = "tiger";	
	/**	 * �õ������ݿ������	 * 	 * @return ���Ӷ���	 */	
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
			    System.out.println("���ӳɹ�");
		     }
		    else{
			    System.out.println("����ʧ��");
		    } 
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
