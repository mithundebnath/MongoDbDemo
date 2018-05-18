package com.cephServiceDemo.org.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.cephServiceDemo.org.pojo.Key;



@Repository
@Qualifier("KeysDao")
public class KeysDaoImpl implements KeysDao {

	@Autowired
	MongoTemplate mongoTemplate;

	final String COLLECTION = "randomKeyIds";

	@Override
	public void create(Key key) {

		mongoTemplate.insert(key);
	}

	@Override
	public void update(Key key) {
		mongoTemplate.save(key);

	}

	@Override
	public void delete(Key key) {
		mongoTemplate.remove(key);

	}

	@Override
	public void deleteAll() {
		mongoTemplate.remove(new Query(), COLLECTION);

	}

	@Override
	public Key find(Key key) {
		Query query = new Query(Criteria.where("_id").is(key.getId()));
		return mongoTemplate.findOne(query, Key.class, COLLECTION);
	}

	@Override
	public List<Key> findAll() {
		return (List<Key>) mongoTemplate.findAll(Key.class);
	}

}
