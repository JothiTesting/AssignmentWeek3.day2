package Assign.week3;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class sortusingcollection {
	
//	 Required Output: Wipro, HCL , CTS, Aspire Systems
	
	
public static void main(String args[]) 
{

	//1.Convert it into a character array
	Set<String> ch=new TreeSet<String>();

	//2.Declare a Set as charSet for Character
     ch.add("Wipro");
 
    ch.add("HCL");
	 
   ch.add("CTS");
   ch.add("ASPIRE Systems");
 	Iterator i=((TreeSet<String>) ch).descendingIterator();  
    while(i.hasNext())  
    {  
        System.out.println(i.next());  
    }  
			
	

}
}
