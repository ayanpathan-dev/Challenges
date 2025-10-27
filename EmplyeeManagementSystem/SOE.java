package com.logical;
import java.util.*;
public class SOE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Range");
		int n=sc.nextInt();
		sc.close();
		int sum=0;
		 for(int i=0 ;i<=n;i++) {
			 if(i%2==0) {
				 sum=sum+i;
			 }
		 }
		System.out.println("SUM OF EVEN NO IS : "+sum);

	}

}
