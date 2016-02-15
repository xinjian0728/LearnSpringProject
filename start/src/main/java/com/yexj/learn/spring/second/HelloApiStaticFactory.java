package com.yexj.learn.spring.second;

import com.yexj.learn.spring.second.impl.HelloApiImpl;

public class HelloApiStaticFactory {
	public static HelloApi newInstance(String message){
		return new HelloApiImpl(message);
	}
}
