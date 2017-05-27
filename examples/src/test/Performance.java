package test;

import java.util.*;

public class Performance {
    public static void main(String[] args){
        Vector v=new Vector();
        Object element;
        Enumeration en;
        Iterator iter;
        long start;
        
        for(int i=0; i<1000000; i++){
            v.add("New Element");
        }
        
        en=v.elements();
        iter=v.iterator();
        //*****CODE BLOCK FOR ITERATOR**********************
        start=System.currentTimeMillis();
        while(iter.hasNext()){
            element=iter.next();
        }
        System.out.println("Iterator took " + (System.currentTimeMillis()-start));
        //*************END OF ITERATOR BLOCK************************
        
        System.gc();   //request to GC to free up some memory
        //*************CODE BLOCK FOR enERATION*******************
        start=System.currentTimeMillis();
        while(en.hasMoreElements()){
            element=en.nextElement();
        }
        System.out.println("eneration took " + (System.currentTimeMillis()-start));
        //************END OF enERATION BLOCK**********************
    }
}