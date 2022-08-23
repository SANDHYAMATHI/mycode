package com.dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.controller.EProductEntity;


public class EProductDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<EProductEntity> getAllProducts() {

		return jdbcTemplate.query("select * from user1", new RowMapper<EProductEntity>() {

			public EProductEntity mapRow(ResultSet rs, int rowNum) throws SQLException {

				EProductEntity obj = new EProductEntity();
				obj.setId(rs.getLong(1));
				obj.setName(rs.getString(2));
				obj.setEmail(rs.getString(3));
				return obj;
			}
		});

	}

	public EProductEntity getProductById(long id) {

		return jdbcTemplate.query("select * from user1 where id=" + id, new ResultSetExtractor<EProductEntity>() {

			public EProductEntity extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					EProductEntity obj = new EProductEntity();
					obj.setId(rs.getLong(1));
					obj.setName(rs.getString(2));
					obj.setEmail(rs.getString(3));
					return obj;
					
				}

				return null;
			}
		});

	}

	public void updateProduct(EProductEntity obj) {
		if (obj.getId() > 0) {
			String sql = "update user1 set name=?,email=? where id=?";
			jdbcTemplate.update(sql, obj.getName(), obj.getEmail(), obj.getId());
		} else {
			String sql = "insert into user1 (name,email) values (?,?)";
			jdbcTemplate.update(sql, obj.getName(), obj.getEmail());
		}
	}


}