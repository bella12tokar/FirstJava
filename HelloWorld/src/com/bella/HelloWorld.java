package com.bella;

public class HelloWorld {
		static int methodCount;
		static String className;

	public static void main(String[] args) {
		int mainInt = 1;
		// TODO Auto-generated method stub
		System.out.println("First Java App");
		System.out.println("Another Test");
		System.out.println("Method count: " + methodCount);
		System.out.println("Class Name: " + className);
		
		methodCount += mainInt;
		
		System.out.println("Method count: " + methodCount);
		
		float f1 = 845.4f;
		int tryfloat = (int)f1;
		
		System.out.println("Float: " + f1 + ", Cast float: " + tryfloat);
		
		int test1 = 5;
		int test2 = 12;
		int test3 = test1 + test2;
		
		System.out.println("Adding the first two variables together gives me: " + test3);
		
		int test4 = 3;
		
		System.out.println(test1 + test2 * test4);
		System.out.println((test1 + test2) * test4);
		System.out.println(test1 + (test2 * test4));
		
		test1 += 15;
		System.out.println(test1);
		
		test1 += test2;
		System.out.println(test1);
		
		test4 += (test1*2)-6;
		System.out.println(test4);
		
		test1 = test2 = 13;
		test4 = 15;
		
		System.out.println(test1 == test2);
		System.out.println(test1 <= test2);
		System.out.println(test1!=test2);
		System.out.println(test1>test2);
		System.out.println(test4 < (test1+test2));
		
		test1 = test2 & test3;
		System.out.println("50 AND 19 is: " + test1);
	
		String firstName = "Bella";
		String lastName = "Tokar";
		
		System.out.println(firstName + " " + lastName);
		
		
	}

}
