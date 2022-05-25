package com.jdbcexample;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class StudentJDBCTemplate1 implements StudentDao {
	
	private SimpleJdbcCall jdbcCall;
	private DataSource dataSource;
	public Student getStudent(Integer id) {
	      SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
	      Map<String, Object> out = jdbcCall.execute(in);// out_name="Amritha", out_age=20

	      Student student = new Student();
	      student.setId(id);
	      student.setName((String) out.get("out_name"));
	      student.setAge((Integer) out.get("out_age"));
	      //101, Amritha,20
	      return student;
	   }
	@Override
	public void setDataSource(DataSource ds) {
		// TODO Auto-generated method stub
		 this.dataSource = dataSource;
	      this.jdbcCall =  new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
		
	}
	@Override
	public void create(String name, Integer age) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
/*
		mysql
		
		DELIMITER $$

DROP PROCEDURE IF EXISTS `TEST`.`getRecord` $$
CREATE PROCEDURE `TEST`.`getRecord` (
IN in_id INTEGER,
OUT out_name VARCHAR(20),
OUT out_age  INTEGER)
BEGIN
   SELECT name, age
   INTO out_name, out_age
   FROM Student where id = in_id;
END $$

DELIMITER ;

	Oracle
CREATE PROCEDURE getRecord (IN in_id INTEGER, OUT out_name VARCHAR(20), OUT out_age  INTEGER)
BEGIN
   SELECT name, age
   INTO out_name, out_age
   FROM Student where id = in_id;
END $$
*/