package com.creational.singleton;

public class LazySingletonClass {

	private static LazySingletonClass INSTANCE = null;
	private static Object lock = new Object();

	private LazySingletonClass() {
	}

	public static LazySingletonClass getInstance() {
		synchronized (lock) {
			if (null == INSTANCE)
				INSTANCE = new LazySingletonClass();
		}
		return INSTANCE;
	}

}
