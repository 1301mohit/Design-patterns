package com.bridgelabz.creational.singletonpattern;

public class BillPughSingleton {
	private BillPughSingleton () {}
	private static class SingletonHelper{
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
}
