package com.venkat;

class Parent {

	public void m1() {
		System.out.println("hello i am from parent");
	}
	protected void mm1()
	{
		System.out.println("i am from parent mm1");
	}
	static void mm2()
	{
		System.out.println("static parent method");
	}

}

class Child extends Parent {
	public void m1() {
		System.out.println("hello i am from child");
	}
	protected void mm1()
	{
		System.out.println("i am from child mm1");
	}
	static void mm2()
	{
		System.out.println("static child method");
	}
}
class GrandChild extends Child
{
	public void m1() {
		System.out.println("hello i am from grandchild");
	}
	
}

class OverloadingTest {
	
	public static void main(String[] args) {
		//Parent o =new Parent() ;
		Parent c = new Child();
		Parent g = c;
		c.mm2();

	}
}
