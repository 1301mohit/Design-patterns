package com.bridgelabz.creational.singletonpattern;

public class EagerInitialization {
	
	private static final EagerInitialization instance = new EagerInitialization();
	private EagerInitialization() {};
	public static EagerInitialization getInstance() {
		return instance;
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
