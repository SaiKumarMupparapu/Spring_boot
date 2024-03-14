package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MsgRestController {
    private MsgServie msgserv;
    @Autowired
	public MsgRestController(MsgServie msgserv) {
		this.msgserv = msgserv;
	}
    @GetMapping("/welcome")
    public String getMsg() {
    	return msgserv.getWelcomeMsg();
    }
}
