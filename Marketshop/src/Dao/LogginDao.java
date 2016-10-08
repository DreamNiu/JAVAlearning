package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




import util.DBHelper;
import LOG.Loggin;


public class LogginDao {
	

	public Loggin getLoggin(String E_ID) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from LOGGIN WHERE E_ID=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, E_ID);
			rs = stmt.executeQuery();
			if (rs.next()) {
				Loggin log = new Loggin();
				log.setE_ID(rs.getString("E_ID"));
				log.setE_PASSWD(rs.getString("E_PASSWD"));
				log.setE_QUAN(rs.getString("E_QUAN"));
				return log;
			} else {
				return null;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}
	public Loggin Add(String E_ID,String E_PASSWD,String E_QUAN) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "INSERT INTO LOGGIN(E_ID,E_PASSWD,E_QUAN) VALUES('"+E_ID+"','"+E_PASSWD+"','"+E_QUAN+"')";
			stmt = conn.prepareStatement(sql);	
			stmt.executeUpdate();
			return null;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}
	public Loggin Delete(String E_ID) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "DELETE FROM LOGGIN WHERE E_ID=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, E_ID);
			stmt.executeUpdate();
			return null;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}
	
}
