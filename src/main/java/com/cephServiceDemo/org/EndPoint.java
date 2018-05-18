package com.cephServiceDemo.org;

import java.util.UUID;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author mithun.debnath
 *
 */

@RestController
@RequestMapping(value = { "/mongoDemo"})
public class EndPoint {

	@Autowired
	Utility utility;

	@PostMapping(value = { "/store"})
	public String executeProcessPost()
			throws JSONException {
		String stroreValue=UUID.randomUUID().toString();
		String outputObject = utility.store(stroreValue);
		return outputObject;
	}
}
