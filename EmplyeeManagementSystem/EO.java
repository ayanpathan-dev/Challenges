package com.logical;
import java.util.*;
public class EO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n =sc.nextInt();
        sc.close();
        if(n%2==0) {
        	System.out.println("Number is Even");
        }else if(n%2!=0) {
        	System.out.println("Number is odd");
        }
	}

}
