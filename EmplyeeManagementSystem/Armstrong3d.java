package com.logical;
import java.util.*;
public class Armstrong3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers :");
        int n = sc.nextInt();
        sc.close();
        int temp =n;
        int arm=0;
        while(temp!=0){
        	int digit =temp%10;
        	arm=arm +digit*digit*digit;
        	temp=temp/10;
        }
        System.out.println("The Number is :"+arm);
        if(arm==n) {
        	System.out.println("Is Armstrong no");
        }else{
        	System.out.println("Is not Armstrong no");
        }
        
        
	}

}
