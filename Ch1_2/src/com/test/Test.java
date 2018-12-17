package com.test;

import java.util.List;

import org.apache.catalina.Session;
import org.apache.ibatis.session.SqlSession;

import com.dao.BaseDao;
import com.dao.FlowerDao;
import com.entity.Flower;



class Super {
	public Integer getLenght() {
		return new Integer(4); 	
	}
}

public class Test extends Super {
	
}