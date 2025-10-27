package com.logical;
import java.util.*;
public class SOD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUM :");
        int n = sc.nextInt();
        sc.close();
        int sum =0;
        
        while(n!=0) {
          int digit= n%10;
          sum =sum+digit;
          n=n/10; 		  
        }    
        
        System.out.println("Sum Of Digit : "+sum);
	}
}
