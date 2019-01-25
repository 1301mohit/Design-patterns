package com.bridgelabz.creational.singletonpattern;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
	public static void main(String[] args) {
        EagerInitialization instanceOne = EagerInitialization.getInstance();
        EagerInitialization instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
            
            for (Constructor constructor : constructors) {
              
            	//Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitialization) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("HashCode of instance1:"+instanceOne.hashCode());
        System.out.println("Hasncode of instance2:"+instanceTwo.hashCode());
    }

	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
}
