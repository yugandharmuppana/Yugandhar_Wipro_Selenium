package Day8_assignment;

import java.util.*;
import java.util.LinkedList;
public class LinkedList_Demo {
	 public static void main(String[] args) {
	        
	        LinkedList<String> LL= new LinkedList<String>(List.of("g","o","o","d"));
            System.out.println(LL);
            for (String ch:LL) 
            {
            	System.out.println(ch+" ");
            	
            }
           /*           
            Iterator<String> itr = new LL.iterator();
            while(itr.hasNext())
            {
            	System.out.println(itr.next());
            */ 
            }
     }