package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBHelper;
import LOG.Employee;
import LOG.VIP;

public class EmployeeDao {
	public ArrayList<Employee> getALLEMP() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Employee> list = new ArrayList<Employee>();// ��Ʒ����
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from EMPLOYEE ";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Employee e = new Employee();
				e.setE_ID(rs.getString("E_ID"));
				e.setE_NAME(rs.getString("E_NAME"));
				e.setE_TEL(rs.getString("E_TEL"));
				e.setE_EMAIL(rs.getString("E_EMAIL"));
				e.setE_ADRESS(rs.getString("E_ADRESS"));
				e.setE_BIRTHDAY(rs.getString("E_BIRTHDAY"));
				e.setE_IDNUM(rs.getString("E_IDNUM"));
				e.setE_JOBDATE(rs.getString("E_JOBDATE"));
			    e.setE_SEX(rs.getString("E_SEX"));
			    e.setE_JOB(rs.getString("E_JOB"));
				list.add(e);
			}
			return list;
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

	// ��ȡ������Ա��Ϣ
	public Employee getEMPByID(String E_ID) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from EMPLOYEE WHERE E_ID=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, E_ID);
			
			rs = stmt.executeQuery();
			if (rs.next()) {
				Employee e = new Employee();
				e.setE_ID(rs.getString("E_ID"));
				e.setE_NAME(rs.getString("E_NAME"));
				e.setE_TEL(rs.getString("E_TEL"));
				e.setE_EMAIL(rs.getString("E_EMAIL"));
				e.setE_ADRESS(rs.getString("E_ADRESS"));
				e.setE_BIRTHDAY(rs.getString("E_BIRTHDAY"));
				e.setE_IDNUM(rs.getString("E_IDNUM"));
				e.setE_JOBDATE(rs.getString("E_JOBDATE"));
			    e.setE_SEX(rs.getString("E_SEX"));
			    e.setE_JOB(rs.getString("E_JOB"));
				return e;
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
	//
	public  Employee addEM(String E_ID,String E_NAME,String E_TEL,String E_EMAIL,String E_ADRESS,String E_BIRTHDAY ,String E_IDNUM,String E_JOBDATE,String E_SEX,String E_JOB){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "INSERT INTO EMPLOYEE(E_ID,E_NAME,E_SEX,E_ADRESS,E_TEL,E_EMAIL,E_IDNUM,E_BIRTHDAY,E_JOBDATE,E_JOB) VALUES('"+E_ID+"',"
					+ "'"+E_NAME+"','"+E_SEX+"','"+E_ADRESS+"','"+E_TEL+"','"+E_EMAIL+"','"+E_IDNUM+"','"+E_BIRTHDAY+"','"+E_JOBDATE+"','"+E_JOB+"') ";
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
	public Employee DeleteEM(String E_ID) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "DELETE FROM EMPLOYEE WHERE E_ID=?";
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
	public  Employee modifyEM(String E_ID,String E_NAME,String E_TEL,String E_EMAIL,String E_ADRESS,String E_BIRTHDAY ,String E_IDNUM,String E_JOBDATE,String E_SEX,String E_JOB){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "UPDATE EMPLOYEE SET E_ID=?,E_NAME=?,E_SEX=?,E_ADRESS=?,E_TEL=?,E_EMAIL=?,E_IDNUM=?,E_BIRTHDAY=?,E_JOBDATE=?,E_JOB=?  WHERE E_ID=? ";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, E_ID);
			stmt.setString(2, E_NAME);
			stmt.setString(3, E_SEX);
			stmt.setString(4, E_ADRESS);
			stmt.setString(5, E_TEL);
			stmt.setString(6, E_EMAIL);
			stmt.setString(7, E_IDNUM);
			stmt.setString(8, E_BIRTHDAY);
			stmt.setString(9, E_JOBDATE);
			stmt.setString(10, E_JOB);
			stmt.setString(11, E_ID);
			
			
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