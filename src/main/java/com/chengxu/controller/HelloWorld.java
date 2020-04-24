package com.chengxu.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@GetMapping("/hello")
	public String doReq() {
		return "hello,world! 最后一次提交888！！！   </br></br></br> [请求时间: "
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "]";
	}
}
