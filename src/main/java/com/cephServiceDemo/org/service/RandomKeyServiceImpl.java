package com.cephServiceDemo.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cephServiceDemo.org.dao.KeysDao;
import com.cephServiceDemo.org.pojo.Key;

@Service("KeyService")
public class RandomKeyServiceImpl implements RandomKey{

	@Autowired
	KeysDao cephIdsDao;
	
	@Override
	public void create(Key key) {
		cephIdsDao.create(key);
		
	}

	@Override
	public void update(Key key) {
		cephIdsDao.update(key);
		
	}

	@Override
	public void delete(Key key) {
		cephIdsDao.delete(key);
		
	}

	@Override
	public void deleteAll() {
		cephIdsDao.deleteAll();
		
	}

	@Override
	public Key find(Key key) {
		return cephIdsDao.find(key);
	}

	@Override
	public List<Key> findAll() {
		return cephIdsDao.findAll();
	}

}
