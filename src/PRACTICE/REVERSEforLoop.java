package PRACTICE;

public class REVERSEforLoop 
{
	public static void main(String[] args) 
	{
		 String a = "RAHUL"; //reverse printing
				 //	 01234
		String rev = "";// OR String rev = null;
		 char x;  //R,A,H,U,L
		 
		 for(int i=0; i<a.length();i++)
		 {
			x = a.charAt(i);
			 rev = x + rev;
			 
		 } 
		 //OR :-
		//for(int i = a.length()-1; i>=0; i--)
		//{
		//	rev = rev + a.charAt(i);
			
		//}
		System.out.println(rev);	
		
	}
	
	
	

}
