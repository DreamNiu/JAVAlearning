package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBHelper;
import LOG.Cart;
import LOG.Employee;

public class CartDao {

	public ArrayList<Cart> getALLCart() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Cart> list = new ArrayList<Cart>();// ��Ʒ����
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from SELLRECORD ";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Cart item = new Cart();
				item.setS_ID(rs.getString("S_ID"));
				item.setS_NAME(rs.getString("S_NAME"));
				item.setS_SELLPRICE(rs.getDouble("S_SELLPRICE"));
				item.setS_SELLNUM(rs.getDouble("S_SELLNUM"));
				item.setS_PRICE(rs.getDouble("S_PRICE"));
				item.setS_TOTAL(rs.getDouble("S_TOTAL"));
				item.setS_PROFIT(rs.getDouble("S_PROFIT"));
				item.setS_TIME(rs.getString("S_TIME"));
				item.setE_ID(rs.getString("E_ID"));
				list.add(item);
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

	public ArrayList<Cart> getALLCartByID(String S_ID) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Cart> list = new ArrayList<Cart>();// ��Ʒ����
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from SELLRECORD WHERE S_ID=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, S_ID);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Cart item = new Cart();
				item.setS_ID(rs.getString("S_ID"));
				item.setS_NAME(rs.getString("S_NAME"));
				item.setS_SELLPRICE(rs.getDouble("S_SELLPRICE"));
				item.setS_SELLNUM(rs.getDouble("S_SELLNUM"));
				item.setS_PRICE(rs.getDouble("S_PRICE"));
				item.setS_TOTAL(rs.getDouble("S_TOTAL"));
				item.setS_PROFIT(rs.getDouble("S_PROFIT"));
				item.setS_TIME(rs.getString("S_TIME"));
				item.setE_ID(rs.getString("E_ID"));
				list.add(item);
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

	public Cart Save(String id, String name, Double price, Double sellprice,
			Double num, Double total, Double profit, String time, String e_id) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "INSERT INTO SELLRECORD(S_ID,S_NAME,S_SELLPRICE,S_PRICE,S_SELLNUM,S_TOTAL,S_PROFIT,S_TIME,E_ID) VALUES('"
					+ id
					+ "','"
					+ name
					+ "','"
					+ sellprice
					+ "','"
					+ price
					+ "','"
					+ num
					+ "','"
					+ total
					+ "','"
					+ profit
					+ "','"
					+ time + "','" + e_id + "')"; // SQL语句
			stmt = conn.prepareStatement(sql);
			stmt.executeUpdate();
			return null;

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} finally {
			// 释放数据集对象
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			// 释放语句对象
			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}

		}
	}

	public ArrayList<Cart> getALLCartByTime(String time) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Cart> list = new ArrayList<Cart>();// ��Ʒ����
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from SELLRECORD WHERE S_TIME=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, time);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Cart item = new Cart();
				item.setS_ID(rs.getString("S_ID"));
				item.setS_NAME(rs.getString("S_NAME"));
				item.setS_SELLPRICE(rs.getDouble("S_SELLPRICE"));
				item.setS_SELLNUM(rs.getDouble("S_SELLNUM"));
				item.setS_PRICE(rs.getDouble("S_PRICE"));
				item.setS_TOTAL(rs.getDouble("S_TOTAL"));
				item.setS_PROFIT(rs.getDouble("S_PROFIT"));
				item.setS_TIME(rs.getString("S_TIME"));
				item.setE_ID(rs.getString("E_ID"));
				list.add(item);
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
	public ArrayList<Cart> getALLCartByEID(String E_ID) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Cart> list = new ArrayList<Cart>();// ��Ʒ����
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from SELLRECORD WHERE S_ID=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, E_ID);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Cart item = new Cart();
				item.setS_ID(rs.getString("S_ID"));
				item.setS_NAME(rs.getString("S_NAME"));
				item.setS_SELLPRICE(rs.getDouble("S_SELLPRICE"));
				item.setS_SELLNUM(rs.getDouble("S_SELLNUM"));
				item.setS_PRICE(rs.getDouble("S_PRICE"));
				item.setS_TOTAL(rs.getDouble("S_TOTAL"));
				item.setS_PROFIT(rs.getDouble("S_PROFIT"));
				item.setS_TIME(rs.getString("S_TIME"));
				item.setE_ID(rs.getString("E_ID"));
				list.add(item);
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
}