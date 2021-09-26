package com.venkat;

public class SingletonJava {
	public static SingletonJava singleton=null;
	private int id;
	private String name;
	private SingletonJava() {
		
	}
	public static SingletonJava getInstance()
	{
		if(singleton == null)
		{
			singleton =new SingletonJava();
		}
		return singleton;
	}

	public static void main(String[] args) {
		SingletonJava s = new SingletonJava();
		SingletonJava x = getInstance();
		SingletonJava y = getInstance();
				
		System.out.println(x.hashCode());
		s.id= 10;
		s.name ="venkat";
		SingletonJava s1 = new SingletonJava();
		System.out.println(y.hashCode());
				
	}
}
