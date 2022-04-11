package it.eb.segreteria.dao;
<<<<<<< HEAD
import java.sql.ResultSet;
	import java.util.HashMap;
	import java.util.Map;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
	import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
	import org.springframework.jdbc.core.namedparam.SqlParameterSource;
	import org.springframework.jdbc.support.rowset.ResultSetWrappingSqlRowSet;
	import org.springframework.jdbc.support.rowset.SqlRowSet;
	import org.springframework.stereotype.Repository;
	


	@Repository
	public class GenericDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	NamedParameterJdbcTemplate namedParameterjdbcTemplate;


	    public Map<String, Object> getQueryResult(String query, Map<String,Object> inParamMap){

	    //Preparo i parametri in ingresso
	        SqlParameterSource in = new MapSqlParameterSource(inParamMap);
	        Map<String, Object> res =  namedParameterjdbcTemplate.queryForMap(query, in);
	       
	    return res;
	    }
	   

	    public ResultSet getQueryResultSet(String query, Map<String,Object> inParamMap){

	    //Preparo i parametri in ingresso
	        SqlParameterSource in = new MapSqlParameterSource(inParamMap);
	        SqlRowSet results = namedParameterjdbcTemplate.queryForRowSet(query, in);
	        //Map<String, Object> res =
	       
	    return ((ResultSetWrappingSqlRowSet) results).getResultSet();
	    }
	   
	   
	}
	


=======
//package com.thyroid.app.dao;

import java.sql.ResultSet;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.rowset.ResultSetWrappingSqlRowSet;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

@Repository
public class GenericDAO {
	
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterjdbcTemplate;
	
	
    public Map<String, Object> getQueryResult(String query, Map<String,Object> inParamMap){
	
    	//Preparo i parametri in ingresso
        SqlParameterSource in = new MapSqlParameterSource(inParamMap);
        Map<String, Object> res =  namedParameterjdbcTemplate.queryForMap(query, in);
        
    	return res;
    }
    
    
    public ResultSet getQueryResultSet(String query, Map<String,Object> inParamMap){
	
    	//Preparo i parametri in ingresso
        SqlParameterSource in = new MapSqlParameterSource(inParamMap);
        SqlRowSet results = namedParameterjdbcTemplate.queryForRowSet(query, in);
        //Map<String, Object> res = 
        
    	return ((ResultSetWrappingSqlRowSet) results).getResultSet();
    }
    
    
}
>>>>>>> 03edfd6 (first commit)
