

package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
@Service
public class MsgServie {
	private org.slf4j.Logger logger=
			LoggerFactory.getLogger(MsgServie.class);
	
	public String getWelcomeMsg() {
		logger.info("welcome msg---started");
		String msg="welcome to ashokIt";
		logger.info("welcome msg ended");
		return msg;
	}

}