package com.yexj.learn.spring.second;

import com.yexj.learn.spring.second.impl.HelloApiImpl;

public class HelloApiInstanceFactory {
	
	// 实例工厂的方法不是静态的static -- non-static
	public HelloApi newInstance(String message) {
		return new HelloApiImpl(message);
	}
}
