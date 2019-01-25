package com.bridgelabz.creational.singletonpattern;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;
	private ThreadSafeSingleton() {};
	public synchronized static ThreadSafeSingleton getInstance() {
		if(instance == null) {
			synchronized(ThreadSafeSingleton.class) {
				if(instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}	
		}
		return instance;
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
}
