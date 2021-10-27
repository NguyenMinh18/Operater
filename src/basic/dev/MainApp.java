package basic.dev;

import java.util.Scanner;

import org.graalvm.compiler.replacements.ConstantStringIndexOfSnippets;

public class MainApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Thong tin");
		String line = sc.nextLine();
		System.out.println("Nhap so nguyen");
		int i = sc.nextInt();
		
		System.out.print(i);
		System.out.println("Nhap so long");

		long l = sc.nextLong();
		
		System.out.print(l);
		System.out.println("Nhap so float");
		float f = sc.nextFloat();
		
		System.out.print(f);
		System.out.println("Nhap so double");
		double d = sc.nextDouble();
		
		System.out.print(d);
	}

}