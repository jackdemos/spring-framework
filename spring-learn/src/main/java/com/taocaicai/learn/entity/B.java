package com.taocaicai.learn.entity;

import lombok.Data;

/**
 * @project spring
 * @author Oakley
 * @created 2021-09-15 05:28:5:28
 * @package com.taocaicai.learn.entity
 * @description TODO
 * @since: 0.0.0.1
 */

public class B {
	private  String name;
	private A a;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
}
