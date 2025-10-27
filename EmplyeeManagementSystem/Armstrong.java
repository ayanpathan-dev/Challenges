package com.logical;
import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int n = sc.nextInt();
		sc.close();
		int temp=n;
		int cnt=0;
		while(temp!=0) {
			temp=temp/10;
			cnt++;
		}
		temp=n;
		double arm=0;
		while(temp!=0) {
			int digit=temp%10;
			arm=arm+ Math.pow(digit, cnt);
			temp=temp/10;
		}
		System.out.println("Number is :" + arm);
		 
		if(arm==n) {
			System.out.println("Is Armstron number");
			
		}else {
			System.out.println("Not an armstrong");
		}
		

	}

}
