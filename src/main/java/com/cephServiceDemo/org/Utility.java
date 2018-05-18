package com.cephServiceDemo.org;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cephServiceDemo.org.constants.Constants;
import com.cephServiceDemo.org.pojo.Key;
import com.cephServiceDemo.org.service.RandomKeyServiceImpl;

@Component
public class Utility {

	private static Logger log = LoggerFactory.getLogger(Utility.class);

	@Autowired
	RandomKeyServiceImpl KeyService;

	public Utility() {

	}

	public String store(String stroreValue) {
		try {

			// store to mongodb
			Key key1 = new Key(stroreValue);
			KeyService.create(key1);
			log.info("uploaded******");
			return Constants.successResponse.replace("pathvalue", stroreValue);
		} catch (Exception ex) {
			return Constants.errorResponse.replace("errorResponse", ex.getMessage());
		}

	}
}
