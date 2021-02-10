package org.qait.training.trainingTest;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	List<String> arr=new ArrayList<String>();
        arr.add("avi");  
        arr.add("arun");    
        arr.add("neha");    
        arr.add("varun"); 
        
        List<Integer> link=new LinkedList<Integer>();  
        link.add(1);   
        link.add(2);    
        link.add(3);    
        link.add(4);    
          
        System.out.println("Arraylist: "+arr);  
        System.out.println("Linkedlist: "+link);  
    }
}
