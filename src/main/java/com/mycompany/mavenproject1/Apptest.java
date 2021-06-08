package com.mycompany.mavenproject1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Apptest {

	@Test
	public void test() {
		System.out.println("Test Cases Running Successfully");
		
	}

	 
	public static void DatabaseWindow() 
 	{      
       System.out.println("Database Window is opening Successfully");
       SqlServer();
    }
    public static void SignInWindow() 
    {
       System.out.println("Sign_in Window is opening Successfully");
    }
    
    public static void SqlServer()
    {
    	System.out.println("SQL Server too running successfully ! ");
    }
    
    public static void indexfile()
    {
    	System.out.println("Index File Updated successfully ! ");
    }
	
	
}
