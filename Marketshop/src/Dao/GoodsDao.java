package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBHelper;
import LOG.Goods;


public class GoodsDao {
	// ��ȡ������Ʒ��Ϣ
	public ArrayList<Goods> getALLGoods() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Goods> list = new ArrayList<Goods>();// ��Ʒ����
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from GOODS ";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Goods good = new Goods();
				good.setS_ID(rs.getString("S_ID")); // ID
				good.setS_NAME(rs.getString("S_NAME")); // ���
				good.setS_BIAO(rs.getString("S_BIAO")); // ��׼֤��
				good.setS_ADRESS(rs.getString("S_ADRESS")); // ���
				good.setS_COMPANYID(rs.getString("S_COMPANYID")); // ��˾��
				good.setS_SPEC(rs.getNString("S_SPEC")); // ���
				good.setS_SUPPLIERID(rs.getString("S_SUPPLIERID")); // ��Ӧ�̱��
				good.setS_NUM(rs.getDouble("S_NUM"));
				good.setS_PRICE(rs.getDouble("S_PRICE"));
				good.setS_SELLNUM(rs.getDouble("S_SELLNUM"));
				good.setS_SELLPRICE(rs.getDouble("S_SELLPRICE"));
				
				list.add(good);
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

	// ��ȡ������Ʒ��Ϣ
	public Goods getGoodsByID(String S_ID) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from GOODS WHERE S_ID=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, S_ID);
			rs = stmt.executeQuery();
			if (rs.next()) {
				Goods good = new Goods();
				good.setS_ID(rs.getString("S_ID")); // ID
				good.setS_NAME(rs.getString("S_NAME")); // ���
				good.setS_BIAO(rs.getString("S_BIAO")); // ��׼֤��
				good.setS_ADRESS(rs.getString("S_ADRESS")); // ���
				good.setS_COMPANYID(rs.getString("S_COMPANYID")); // ��˾��
				good.setS_SPEC(rs.getNString("S_SPEC")); // ���
				good.setS_SUPPLIERID(rs.getString("S_SUPPLIERID")); // ��Ӧ�̱��
				good.setS_NUM(rs.getDouble("S_NUM"));
				good.setS_PRICE(rs.getDouble("S_PRICE"));
				good.setS_SELLNUM(rs.getDouble("S_SELLNUM"));
				good.setS_SELLPRICE(rs.getDouble("S_SELLPRICE"));
				return good;
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
	public Goods addGoods(String S_ID, 
	String S_NAME, 
	String S_BIAO,
	String S_ADRESS,
	String S_COMPANYID,
	String S_SPEC,
	String S_SUPPLIERID,
	Double S_PRICE,
	Double S_SELLPRICE,
	Double S_NUM,
	Double S_SELLNUM	
	) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "INSERT INTO GOODS(S_ID,S_NAME,S_ADRESS,S_SPEC,S_COMPANYID,S_PRICE,S_SELLPRICE,S_SUPPLIERID,S_BIAO,S_NUM,S_SELLNUM) "
					+ "VALUES('"+S_ID+"','"+S_NAME+"','"+S_ADRESS+"','"+S_SPEC+"','"+S_COMPANYID+"','"+S_PRICE+"','"+S_SELLPRICE+"','"+S_SUPPLIERID+"','"+S_BIAO+"','"+S_NUM+"','"+S_SELLNUM+"')";
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
	public Goods updateGoods(String S_ID, Double S_NUM,Double S_SELLNUM) {
				Connection conn = null;
				PreparedStatement stmt = null;
				ResultSet rs = null;
				try {
					conn = DBHelper.getConnection();
					String sql = "UPDATE GOODS SET S_NUM=S_NUM-?,S_SELLNUM=S_SELLNUM+? WHERE S_ID=?";
					stmt = conn.prepareStatement(sql);
					stmt.setDouble(1, S_NUM);
					stmt.setDouble(2, S_SELLNUM);
					stmt.setString(3, S_ID);				
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
	public Goods DeleteGoods(String S_ID) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "DELETE FROM GOODS WHERE S_ID=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, S_ID);
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
	public Goods modifyGoods(String S_ID, 
			String S_NAME, 
			String S_BIAO,
			String S_ADRESS,
			String S_COMPANYID,
			String S_SPEC,
			String S_SUPPLIERID,
			Double S_PRICE,
			Double S_SELLPRICE,
			Double S_NUM,
			Double S_SELLNUM	
			) {
				Connection conn = null;
				PreparedStatement stmt = null;
				ResultSet rs = null;
				try {
					conn = DBHelper.getConnection();
					String sql = "UPDATE GOODS SET S_ID=?,S_NAME=?,S_ADRESS=?,S_SPEC=?,S_COMPANYID=?,S_PRICE=?,S_SELLPRICE=?,S_SUPPLIERID=?,S_BIAO=?,S_NUM=?,S_SELLNUM=? WHERE S_ID=?";
					stmt = conn.prepareStatement(sql);
					stmt.setString(1, S_ID);
					stmt.setString(2, S_NAME);
					stmt.setString(3, S_ADRESS);
					stmt.setString(4, S_SPEC);
					stmt.setString(5, S_COMPANYID);
					stmt.setDouble(6, S_PRICE);
					stmt.setDouble(7, S_SELLPRICE);
					stmt.setString(8, S_SUPPLIERID);
					stmt.setString(9, S_BIAO);
					stmt.setDouble(10, S_NUM);
					stmt.setDouble(11, S_SELLNUM);
					stmt.setString(12, S_ID);		
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
