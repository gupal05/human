package day1;

import java.util.Scanner;

public class Study01_HelloJava {

	public static void main(String[] args) {
		System.out.println("하나");
		System.out.println("두울");
		System.out.println("세엣");
		
		System.out.println();
		System.out.print("하나");
		System.out.print("두울");
		System.out.print("세엣");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		String name = sc.next();
		int age = sc.nextInt();
		float weight = sc.nextFloat();
		System.out.println(name + " "+age+" "+weight);
	}

}
