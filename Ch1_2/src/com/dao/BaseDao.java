package com.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//ddd
public class BaseDao {
	private static SqlSessionFactory sqlSessionFactory;
	private static final String RESOURCE_FIRE="mybatis-config.xml";
	
	static{
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(RESOURCE_FIRE);
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
	public static SqlSession getSession(){
		return sqlSessionFactory.openSession();
	}
}
