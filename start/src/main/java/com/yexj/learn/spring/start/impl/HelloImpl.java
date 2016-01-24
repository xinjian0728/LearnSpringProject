package com.yexj.learn.spring.start.impl;

import com.yexj.learn.spring.start.Hello;

public class HelloImpl implements Hello {

	public void sayHello(String name) {
		System.out.println("Hello," + name + ".How are you?");
	}

}
