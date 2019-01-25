package com.bridgelabz.creational.singletonpattern;

public class StaticBlockInitialization {
	private static StaticBlockInitialization instance;
	private StaticBlockInitialization(){};
	static {
		try {
			instance = new StaticBlockInitialization();
		}catch(Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	public static StaticBlockInitialization getInstance() {
		return instance;
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
}
