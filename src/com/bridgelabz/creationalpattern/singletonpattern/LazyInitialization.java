package com.bridgelabz.creational.singletonpattern;

public class LazyInitialization {
	private static LazyInitialization instance;
	private LazyInitialization() {};
	public static LazyInitialization getInstance() {
		if(instance == null)
			instance = new LazyInitialization();
		return instance;
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
}
