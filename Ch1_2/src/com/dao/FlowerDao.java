package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.Flower;

public interface FlowerDao {
	public List<Flower> getFlowerList(); 
	public void delFlower(Integer id);
	public int addFlower(@Param("flower") Flower flower); 
}
