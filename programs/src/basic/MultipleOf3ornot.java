package basic;

import java.util.Scanner;

public class MultipleOf3ornot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number for checking multiple of 3 or not");
		int num=sc.nextInt();
		if( num%3==0)
			System.out.println(num+" is divisible by 3");
		else 
			System.out.println(num+" is not divisible by 3");
	}

}
