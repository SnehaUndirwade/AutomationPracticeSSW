package PRACTICE;

public class ChildClass extends ParentClass 
{
	int a = 200;
	public void printVariable()
	{
		System.out.println(a); //Child Class
		System.out.println(super.a); // for parent Class
	}
	public static void main(String[] args) 
	{
		ChildClass x = new ChildClass();
		//System.out.println(x.a);
		x.printVariable();
	}
}
