package com.inherit;

class A
{
	public void test()
	{
		System.out.println("Test method of A");
	}
}
class B extends A
{
	public void test()
	{
		System.out.println("Test method of B");
	}
}

class C extends B
{
	public void test()
	{
		System.out.println("Test method of C");
	}
}

public class MainClass {

	
}
