package com.yexj.learn.spring.chapter3.impl;

import com.yexj.learn.spring.chapter3.HelloApi;

public class HelloImpl implements HelloApi {

	private String message;
	private int index;

	public HelloImpl(String message, int index) {
		this.message = message;
		this.index = index;
	}

	public void sayHello() {
		System.out.println(index + ":" + message);
	}

}
