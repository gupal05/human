package day1;

import java.util.Scanner;

public class Study01_HelloJava {

	public static void main(String[] args) {
		System.out.println("�ϳ�");
		System.out.println("�ο�");
		System.out.println("����");
		
		System.out.println();
		System.out.print("�ϳ�");
		System.out.print("�ο�");
		System.out.print("����");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		String name = sc.next();
		int age = sc.nextInt();
		float weight = sc.nextFloat();
		System.out.println(name + " "+age+" "+weight);
	}

}
