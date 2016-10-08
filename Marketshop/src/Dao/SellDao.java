package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBHelper;
import LOG.Sell;


public class SellDao {
	public ArrayList<Sell> getAllItems() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Sell> list = new ArrayList<Sell>();
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from SELLPORT"; // SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) { 
				Sell item = new Sell();
				item.setS_ID(rs.getString("S_ID"));
				item.setS_NAME(rs.getString("S_NAME"));
				item.setS_SELLPRICE(rs.getDouble("S_SELLPRICE"));
				item.setS_NUM(rs.getDouble("S_NUM"));
				item.setS_TOTAL(rs.getDouble("S_TOTAL"));
				list.add(item);	
			} 
			return list;
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
	public Sell Save(String id,String name,Double sellprice,Double num,Double total ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "INSERT INTO SELLPORT(S_ID,S_NAME,S_SELLPRICE,S_NUM,S_TOTAL) VALUES('"+id+"','"+name+"','"+sellprice+"','"+num+"','"+total+"')"; // SQL语句
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
	public Sell Delete() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "DELETE FROM SELLPORT"; // SQL语句
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
}
