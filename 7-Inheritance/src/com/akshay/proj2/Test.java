package com.akshay.proj2;

public class Test {

	public static void main(String[] args) {

		System.out.println("-----Main Method");
		A a = new A();
		B b=new B();
		C c= new C();
		
		System.out.println();
		
		System.out.println("-----Calling A Class Instance Variables");
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		
		System.out.println();
		
		System.out.println("-----Calling B Class Instance Variables");
		System.out.println(b.d);
		System.out.println(b.e);
		System.out.println(b.c);
		
		System.out.println();
		
		System.out.println("-----Calling C Class Instance Variables");
		System.out.println(c.f);
		System.out.println(c.g);
		System.out.println(c.c);
		
		System.out.println();
		
		A a1 = new B();
		A a2= new C();
		
		System.out.println("-----Calling variables using superclass reference");
		System.out.println(a1.c);
		System.out.println(a2.c);
		
	}

}
