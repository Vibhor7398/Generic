package generic;

import java.util.*;

public class GenericSorting {

	public static <t extends Comparable<t>> void genSort(t[] arr) {

		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr.length-i-1;j++) {
				if(arr[j].compareTo(arr[j+1]) > 0) {
				t temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			}
				
		}
		
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
		genSort(a);// integers sorting
		System.out.println();
		System.out.println();

		System.out.println("Enter strings: ");
		String s[] = new String[5];
		for (int i = 0; i < 5; i++) {
			s[i] = sc.next();
		}
		genSort(s);


		System.out.println();
		System.out.println();
		System.out.println("Enter float: ");

		Float f[] = new Float[5];
		for (int i = 0; i < 5; i++) {
			f[i] = sc.nextFloat();
		}
		genSort(f);

		System.out.println();
		System.out.println();
	}

}
