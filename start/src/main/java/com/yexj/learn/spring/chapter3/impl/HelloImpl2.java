package com.yexj.learn.spring.chapter3.impl;

import com.yexj.learn.spring.chapter3.HelloApi;

public class HelloImpl2 implements HelloApi {

	private String message;
	private Integer index;

	public void sayHello() {
		System.out.println(message + ":" + index);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

}
