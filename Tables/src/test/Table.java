package test;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		 System.out.println("Enter Table Number");
		 Scanner s =new Scanner(System.in);
		 int n= s.nextInt();
		 for(int i=1;i<=10;i++){
			 System.out.println(n+" * "+i+" = "+n*i);
		 }
	}

}
