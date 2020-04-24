package com.chengxu.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@GetMapping("/hello")
	public String doReq() {
		return "hello,world! 我的jenkins部署在内网,所以GitHub无法访问,webhooks是不好用的" + "只能在浏览器地址栏试试啦！！！   </br></br></br> [请求时间: "
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "]";
	}
}
