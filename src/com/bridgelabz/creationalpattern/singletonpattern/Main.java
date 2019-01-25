package com.bridgelabz.creational.singletonpattern;

public class Main {
	public static void main(String[] args) {
		//System.out.println(EagerInitialization.getInstance());
		//System.out.println(StaticBlockInitialization.getInstance());
	//System.out.println(LazyInitialization.getInstance());
		//System.out.println(LazyInitialization.getInstance());
		System.out.println(ThreadSafeSingleton.getInstance());
		System.out.println(ThreadSafeSingleton.getInstance());
		System.out.println(BillPughSingleton.getInstance());
		System.out.println(BillPughSingleton.getInstance());
	}
}
