package PRACTICE;

import java.util.Scanner;

public class scanner_class 
{
	public static void main(String[] args) 
	{
		
	
	Scanner x = new Scanner(System.in);// for write down the console
	
	System.out.println("enter the first value");
	int a = x.nextInt();
	System.out.println("enter th second value");
	int b = x.nextInt();
	
	int c = a + b;
	System.out.println(c);//put the value in console
}
}