package com.chengxu.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@GetMapping("/hello")
	public String doReq() {
		return "hello,Jenkins! 利用http://test.apih5.com:9092/web/forwardRequest的POST请求来转发一次请求试试"
				+ "我的jenkins部署在内网,所以GitHub无法访问,webhooks是不好用的" + "所以需要利用内网穿透工具做一次请求转发就OK了" + ""
				+ "http://192.168.5.5:8080/jenkins/job/TestGit/build?token=GIT_TOKEN   </br></br></br> [请求时间: "
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "]";
	}
}
