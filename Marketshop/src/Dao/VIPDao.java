package Dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import LOG.VIP;
import util.DBHelper;


public class VIPDao {
	//获取所有VIP信息
	public ArrayList<VIP> getALLGoods() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<VIP> list = new ArrayList<VIP>();// ��Ʒ����
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from VIP ";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				VIP vip = new VIP();
				vip.setV_ID(rs.getString("V_ID"));
				vip.setV_NAME(rs.getString("V_NAME"));
				vip.setV_TEL(rs.getString("V_TEL"));
				vip.setV_EMAIL(rs.getString("V_EMAIL"));
				vip.setV_ADRESS(rs.getString("V_ADRESS"));
				vip.setV_DATE(rs.getString("V_DATE"));
				vip.setV_PERIOD(rs.getString("V_PERIOD"));
				list.add(vip);
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

	// 获取单个VIP信息
	public VIP getVIPByID(String V_ID) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from VIP WHERE V_ID=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, V_ID);
			
			rs = stmt.executeQuery();
			if (rs.next()) {
				VIP vip = new VIP();
				vip.setV_ID(rs.getString("V_ID"));
				vip.setV_NAME(rs.getString("V_NAME"));
				vip.setV_TEL(rs.getString("V_TEL"));
				vip.setV_EMAIL(rs.getString("V_EMAIL"));
				vip.setV_ADRESS(rs.getString("V_ADRESS"));
				vip.setV_DATE(rs.getString("V_DATE"));
				vip.setV_PERIOD(rs.getString("V_PERIOD"));
				return vip;
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
	//添加VIP
	public VIP AddVIP(String V_ID,String V_NAME,String V_TEL,String V_ADRESS,String V_DATE,String V_PERIOD,String V_EMAIL) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "INSERT INTO VIP(V_ID,V_NAME,V_TEL,V_ADRESS,V_DATE,V_PERIOD,V_EMAIL) VALUES('"+V_ID+"','"+V_NAME+"',"
					+ "'"+V_TEL+"','"+V_ADRESS+"','"+V_DATE+"','"+V_PERIOD+"',"
							+ " '"+V_EMAIL+"')";
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
	//删除VIP
	public VIP DeleteVIP(String V_ID) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "DELETE FROM VIP WHERE V_ID=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, V_ID);
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
	public VIP modifyVIP(String V_ID,String V_NAME,String V_TEL,String V_ADRESS,String V_DATE,String V_PERIOD,String V_EMAIL) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "UPDATE VIP SET V_ID=?,V_NAME=?,V_TEL=?,V_ADRESS=?,V_DATE=?,V_PERIOD=?,V_EMAIL=? WHERE V_ID=?";
			stmt = conn.prepareStatement(sql);	
			stmt.setString(1, V_ID);
			stmt.setString(2, V_NAME);
			stmt.setString(3, V_TEL);
			stmt.setString(4, V_ADRESS);
			stmt.setString(5, V_DATE);
			stmt.setString(6, V_PERIOD);
			stmt.setString(7, V_EMAIL);
			stmt.setString(8, V_ID);
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
