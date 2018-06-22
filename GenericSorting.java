package generic;

import java.util.*;

public class GenericSorting {

	public static <t> void genSort(t[] arr) {

		Arrays.sort(arr);
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
