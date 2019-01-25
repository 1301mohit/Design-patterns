package com.bridgelabz.structuralpattern.proxypattern;

public class proxypatternclient {
	
	public static void main(String[] args)   
    {  
        OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");  
        access.grantInternetAccess();  
    }  
	
}
