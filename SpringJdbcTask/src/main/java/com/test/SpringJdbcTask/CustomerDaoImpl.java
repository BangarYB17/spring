package com.test.SpringJdbcTask;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CustomerDaoImpl implements CustomerDao {

	private JdbcTemplate jdbctemplate;
	
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}


	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}


	public void save(Customer customer) {
		String  sql= "insert into customer(customerName,city,mobile_no) values(?,?,?)";
		jdbctemplate.update(sql,customer.getCustomerName(),customer.getCity(),customer.getMobile_no());

	}

	
	public List<Customer> FindAll() {
		String sql="select * from customer";
		return jdbctemplate.query(sql, new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer c= new Customer();
				c.setCust_id(rs.getInt("cust_id"));
				c.setCustomerName(rs.getString("customerName"));
				c.setCity(rs.getString("city"));
				c.setMobile_no(rs.getString("mobile_no"));
				return c;
			}
			
		});
		
	}

	public List<Customer> FetchData(int id) {
		String sql = "select * from customer where cust_id=?";
		return jdbctemplate.query(sql,  new Object[] { id },new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer c1= new Customer();
				c1.setCust_id(rs.getInt("cust_id"));
				c1.setCustomerName(rs.getString("customerName"));
				c1.setCity(rs.getString("city"));
				c1.setMobile_no(rs.getString("mobile_no"));
				return c1;
			}
			
		});
	}

	
	public void update(Customer customer) {
		String sql ="update customer set customerName=?, city=? ,mobile_no=? where cust_id=?";
		jdbctemplate.update(sql,customer.getCustomerName(),customer.getCity(),customer.getMobile_no(),customer.getCust_id());
	}

	
	public void delete(int id) {
		String sql = "delete from customer where cust_id=?";
		jdbctemplate.update(sql,id);

	}

}
