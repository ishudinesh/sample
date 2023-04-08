package org.samp;

import java.util.Scanner;

public class ScannerClass {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("what is your name?");
    String name = scanner.nextLine();
    System.out.println("Ans:hello "+name);
	System.out.println("What is your rating ?");	
	int rating = scanner.nextInt();
	System.out.println("Ans :your rating as "+rating);
	System.out.println("What is your Email ?");
	scanner.nextLine();
	String mail = scanner.nextLine();
	System.out.println("Ans : Email is "+mail);
}
}
