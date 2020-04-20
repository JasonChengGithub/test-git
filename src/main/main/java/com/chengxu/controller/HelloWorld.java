package com.chengxu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@GetMapping("/hello")
	public String doReq() {
		return "hello,wellDown! 第三次提交！！！";
	}

}
