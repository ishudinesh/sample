package org.samp;

import java.util.Scanner;

public class ScannerSample {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("What is your Emp id?");
	String id = scanner.nextLine();
	System.out.println("your id is"+id);
	System.out.println("what is your name?");
	String name = scanner.nextLine();
	System.out.println("hello"+name);
	System.out.println("what is your email ?");
	String mail = scanner.nextLine();
	System.out.println("ur email is "+mail);
	System.out.println("what is yout phone number?");
	long phno = scanner.nextLong();
	System.out.println("your phone number is"+phno);
	System.out.println("what is your salary?");
	float salary = scanner.nextFloat();
	System.out.println("your salary is "+salary);
	
	
	
	
	
}
}
