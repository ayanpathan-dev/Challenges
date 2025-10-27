package com.logical;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int n = sc.nextInt();
		sc.close();
		int rev =0;
        int temp =n;
		while(n!=0) {
		 int digit =n%10;
		 rev =rev*10+digit;
		 n=n/10;
		}
		System.out.println( "Reverse Number :"+rev);
		
		if(rev==temp){
           System.out.println("String is palindrome");
	}else {
		System.out.println("String is not palindrome");
	}

}
}
