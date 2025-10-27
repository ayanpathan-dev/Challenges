package com.logical;
import java.util.*;
public class All_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Range :");
       int n= sc.nextInt();
       sc.close();
       
       if(n<=1) {
    	   System.out.println("No Prime Numbers");
    	   return;
       }else {
    	   for(int i=2;i<n;i++) {
    		   boolean flag =true;
    		   for(int j=2 ;j<i;j++) {         //for (int j = 2; j <= Math.sqrt(i); j++)
    			   if(i%j==0) {
    				   flag=false;
    				   break;
    			   }
    		   }
    		   if(flag) {
    			   System.out.println(""+i+"");
    		   }
    	   }
       }
	}
	
}
