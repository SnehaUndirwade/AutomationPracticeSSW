package PRACTICE2;

import java.util.ArrayList;

public class CollectionConcept 
{
	public static void main(String[] args) 
	{
		
//		//int a = 20;
//		//int b = 23;
//		////if we have more dada add in one
//		//int c [] = {20,30,50,60,40,78};
//		//int d [] = {50,60,48,32,54,85};
//		
//		//if we are going also more data then we going collection concept
//		//CASE 1
//		//1.ArrayList --Class
//		ArrayList e = new ArrayList();		
//		e.add(10);//0
//		e.add(20);//1
//		e.add(30);//2
//		e.add(24);//3
//		e.add(26);//4
//		e.add(50);//5
//		// you can add any type of data collection
//		e.add(20.50);    //6
//		e.add('A');      //7
//		e.add("SWAPNIL");//8
//		
//		System.out.println(e);
//		//to select single element then use index concept
//		//get method
//		System.out.println(e.get(4));
//		System.out.println(e.get(8));
		//--------------------------------------
		//CASE 2
		//if specific data need to add
		//integer data--no char, double,string
		
		ArrayList<Integer> f = new ArrayList<Integer>();
		f.add(12);
		f.add(30);
		f.add(35);
		f.add(50);
//		f.add(10.77);          //not possible
//		f.add('A');            //not possible
//		System.out.println(f);
		//--------------------------------
		//CASE 3
		
		ArrayList<String> g = new ArrayList<String>();
		g.add("swapnil");
		g.add("rahul");
		g.add("sachin");
//		g.add('A');//not possible
//		g.add(20);//not possible
		//------------------------------------
		//CASE 3
		
		ArrayList<Integer> h = new ArrayList<Integer>();
		
		h.add(25);
		h.add(54);
		h.add(20);
		h.add(30);
		h.add(68);
		//for print to all element
		System.out.println(h);
		
		//for print single element
		System.out.println(3);
		
		//for replece means edit
		h.set(2,65);
		System.out.println(h);
		
		//for size / arraylist
		System.out.println("Array List Size is =" +h.size());
		
		//for remove
		h.remove(3);
		
		
		
		
		
		
		


		
		
		
	
		
		
		
	}
}
