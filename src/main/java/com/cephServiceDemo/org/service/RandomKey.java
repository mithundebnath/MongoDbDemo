package com.cephServiceDemo.org.service;

import java.util.List;

import com.cephServiceDemo.org.pojo.Key;

public interface RandomKey {

	    public void create(Key key);
	 
	    public void update(Key key);
	 
	    public void delete(Key key);
	 
	    public void deleteAll();
	 
	    public Key find(Key key);
	 
	    public List < Key > findAll();
}
