package PRACTICE2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;



import com.google.common.collect.DiscreteDomain;

public class Collection2 
{
	public static void main(String[] args) 
	{
//		ArrayList a = new ArrayList();
//		a.add(25);
//		a.add(30);
//		a.add(24);
//		a.add(23.55);
//		a.add('A');
//		a.add("RAHUL");
//		System.out.println(a);
	//--------------------------------------------	
//		List b = new ArrayList();
//		b.add(12);
//		b.add(25.36);
//		b.add(50);
//		b.add(60);
//		b.add(30);
//		b.add('A');
//		b.add("swapnil");
//		System.out.println(b);
	//----------------------------------------------
		
//		List<Integer> c = new ArrayList<Integer>();//also you can use any data type(Exa:-String)
//		c.add(23);
////		c.add("Swapnil");//not possible
////		c.add(25.30);//not possible
	//----------------------------------------------
		
//		List<Integer> d = new ArrayList<Integer>();
//		//-----------------------------------
//		List<Integer> f = new LinkedList<Integer>();
//		f.add(20);
//		f.add(42.04);
		//----------------------------------
		
//		HashSet g = new HashSet();
//		g.add(26);
//		g.add(24);
//		g.add(50);
//		g.add(90);
//		g.add(85);
//		g.add(56.25);
//		g.add('K');
//		g.add("SWAPNIL");
//		System.out.println(g);
	//-------------------------------------------
		
//		HashSet<Integer> h = new HashSet<Integer>();
//		h.add(25);
//		//h.add('H');//not possible
		//--------------------------------------
		
//		HashSet<String> i = new HashSet<String>();
//		i.add("SHIVNARAYN");
//		i.add("SWAPNIL");
//		//i.add(25);//not possible
//		i.add("LALCHAND");
//		i.add("SUREKHA");
////		System.out.println(i);
//		//size
//		System.out.println(i.size());
//		//get
//		//System.out.println(i.get("SWAPNIL"));//not understand
//		//i.set("SHIVNARAYN","WALDE");//???????not understand
//		i.remove("SHIVNARAYN");
//		System.out.println(i);
		//--------------------------------------------
		
//		Set<Integer> j = new HashSet<Integer>();
//		j.add(54);
//		j.add(36);
//		j.add(29);
//		j.add(90);
//		j.add(82);
//		j.add(66);
//		System.out.println(j);
//		//Elements one by one call
//		//index concept-NA
//		//Iterator class concept
//		Iterator It = j.iterator();
////		System.out.println(It.next());
////		System.out.println(It.next());
////		System.out.println(It.next());
////		System.out.println(It.next());
////		System.out.println(It.next());
////		System.out.println(It.next());
//		
//		//we can use use here also for loop
//		for(int i=1; i<j.size(); i++)
//		{
//			System.out.println(It.next());
//		}
		//---------------------------------------
//		List k = new ArrayList();
//		k.add(10);
//		k.add(20);
//		k.add(30);
//		k.add(40);
//		k.add(40);
//		k.add(40);
//		k.add(null);         //null-nothing
//		k.add(null);
//		k.add(null);
//		System.out.println(k);
//		
//		Iterator IT = k.iterator();
//		for(int i=0; i<k.size(); i++)
//		{
//			System.out.println(IT.next());
//		}
		//---------------------------------------

		//List l = new HashSet();//not possible
		Set l = new HashSet();
		l.add(10);
		l.add(20);
		l.add(30);	//we can use use double value(Exa:-40,40,40)
		l.add(40);
		l.add(40);
		l.add(40);
		l.add(null);         //null-nothing
		l.add(null);
		l.add(null);
		l.add('L');
		System.out.println(l);
		Iterator It = l.iterator();
		
		for(int i=0; i<l.size(); i++)
		{
			System.out.println(It.next());
		}

		
		
	}
}
