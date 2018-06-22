package generic;

import java.util.Arrays;
import java.util.Scanner;

public class genPrint {

	public static <t> void genPrint(t[] arr) {

		for(int i =0; i<5;i++)
		System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a[] = new Integer[5];
		System.out.println("Enter integers: ");
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		genPrint(a);// integers print
		System.out.println();
		System.out.println();

		System.out.println("Enter strings: ");
		String s[] = new String[5];
		for (int i = 0; i < 5; i++) {
			s[i] = sc.next();
		}
		genPrint(s);//string printing


		System.out.println();
		System.out.println();
		System.out.println("Enter float: ");

		Float f[] = new Float[5];
		for (int i = 0; i < 5; i++) {
			f[i] = sc.nextFloat();
		}
		genPrint(f);//float printing

		System.out.println();
		System.out.println();
	}

}
