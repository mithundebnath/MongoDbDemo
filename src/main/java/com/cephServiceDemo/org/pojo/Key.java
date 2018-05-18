package com.cephServiceDemo.org.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "randomKeyIds")
public class Key {

	@Id
    private String id;
    private String kyes;
    
    public Key(String kyes) {
        super();
        this.kyes = kyes;
    }
    
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }

	public String getKyes() {
		return kyes;
	}

	public void setKyes(String kyes) {
		this.kyes = kyes;
	}
 
	@Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Id:- " + getId() +  ", keys:- " + getKyes());
        return str.toString();
    }
}
