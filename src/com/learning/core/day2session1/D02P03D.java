package com.learning.core.day2session1;
import java.util.Scanner;
public class D02P03D {
	public static void main(String[] args){
		int i,j,n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++)
				System.out.print(i);
			    System.out.println("");
		}
	}
}
