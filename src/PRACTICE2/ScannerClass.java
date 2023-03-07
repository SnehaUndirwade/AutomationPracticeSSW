package PRACTICE2;

import java.util.Scanner;

public class ScannerClass 
{
	public static void main(String[] args) 
	{
		Scanner x = new Scanner(System.in);
		int a = x.nextInt();
		int b = x.nextInt();
		int c = a + b;
		System.out.println(c);
	}
}
