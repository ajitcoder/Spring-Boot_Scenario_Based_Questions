package com.ajit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ajit.model.Product;

@Repository("mysqlProductDAO")
public class MySQLProductImpl implements IProductDAO {

	private static final String INSERT_PRODUCT = "INSERT INTO PRODUCT  VALUES (?,?,?)";
	private static final String SELECT_PRODUCT = "SELECT PID,PNAME,PRICE,CATEGORY FROM PRODUCT";
	private static final String UPDATE_PRODUCT = "UPDATE PRODUCT SET PRICE=? WHERE PID=?";
	private static final String DELETE_PRODUCT = "DELETE PRODUCT FROM PRODUCT WHERE PID=?";

	@Autowired
	private DataSource ds;

	
	int count=0;
	
	@Override
	public int addProduct(Product prod) throws Exception {

		try(Connection con = ds.getConnection();
				PreparedStatement pstmt = con.prepareStatement(INSERT_PRODUCT);){

			 pstmt.setInt(1,prod.getPId());
				pstmt.setString(2, prod.getPName());
				pstmt.setDouble(3, prod.getPrice());
			

			count= pstmt.executeUpdate();

			return count;

		}catch (SQLException se) {

			throw se;
		}catch (Exception e) {

			throw e;
		}
	}

	
	List<Product> list = null;
	
	@Override
	public List<Product> getAllProducts() throws Exception {
		try(Connection con = ds.getConnection();
				PreparedStatement pstmt = con.prepareStatement(SELECT_PRODUCT);){

			
			try(ResultSet rs = pstmt.executeQuery();){

				list = new ArrayList<Product>();

				while(rs.next()) {

					Product product = new Product();
					product.setPId(rs.getInt(1));
					product.setPName(rs.getString(2));
					product.setPrice(rs.getDouble(3));
					

					list.add(product);
				}
				return list;
			}
		}catch (SQLException se) {

			throw se;
		}catch (Exception e) {

			throw e;
		}

	}

	
	int updatedCount=0;
	
	@Override
	public int updateProductPrice(int pId, double newPrice) throws Exception {
		try(Connection con = ds.getConnection();
				PreparedStatement pstmt = con.prepareStatement(UPDATE_PRODUCT);){

			pstmt.setDouble(1, newPrice);
			pstmt.setInt(2, pId);

			updatedCount= pstmt.executeUpdate();

			return updatedCount;

		}catch (SQLException se) {

			throw se;
		}catch (Exception e) {

			throw e;
		}
	}

	int deletedCount=0; 
	
	@Override
	public int deleteProduct(int pId) throws Exception {
		try(Connection con = ds.getConnection();
				PreparedStatement pstmt = con.prepareStatement(DELETE_PRODUCT);){

			pstmt.setInt(1, pId);

			deletedCount= pstmt.executeUpdate();

			return deletedCount;

		}catch (SQLException se) {

			throw se;
		}catch (Exception e) {

			throw e;
		}
	}

}
