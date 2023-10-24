package basic;

import java.util.Scanner;

public class PositiveOrNOt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number for checking positive or not ");
		int numb=sc.nextInt();
		if (numb>0)
			System.out.println(numb+ " is positive");
		else
			System.out.println(numb+" is not positive");
	}

}
