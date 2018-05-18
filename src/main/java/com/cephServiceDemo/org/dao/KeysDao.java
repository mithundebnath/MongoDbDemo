package com.cephServiceDemo.org.dao;

import java.util.List;

import com.cephServiceDemo.org.pojo.Key;

public interface KeysDao {

	public void create(Key car);
	 
    public void update(Key car);
 
    public void delete(Key car);
 
    public void deleteAll();
 
    public Key find(Key car);
 
    public List < Key > findAll();
}
