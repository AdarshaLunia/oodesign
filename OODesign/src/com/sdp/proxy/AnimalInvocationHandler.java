package com.sdp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AnimalInvocationHandler implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		try {

			result = method.invoke(realSubject, args);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}

	private Object realSubject = null;

	public AnimalInvocationHandler(Object realSubject) {
		super();
		this.realSubject = realSubject;
	}

}
