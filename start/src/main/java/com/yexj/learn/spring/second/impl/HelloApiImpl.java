package com.yexj.learn.spring.second.impl;

import com.yexj.learn.spring.second.HelloApi;

public class HelloApiImpl implements HelloApi {

	private String message;

	public HelloApiImpl() {
		this.message = "Hello world!";
	}

	public HelloApiImpl(String message) {
		this.message = message;
	}

	public void sayHello() {
		System.out.println(message);
	}

}
