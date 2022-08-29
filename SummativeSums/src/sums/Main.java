package sums;

public class Main {

	public static void main(String[] args) {
		
		int example1[] = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
		int example2[] = { 999, -60, -77, 14, 160, 301 };
		int example3[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
		
		System.out.println("#1 Array Sum: "+addArr(example1));
		System.out.println("#2 Array Sum: "+addArr(example2));
		System.out.println("#3 Array Sum: "+addArr(example3));
	}
	public static int addArr(int[] numbers) {
		int count=0;
		for (int i: numbers)
			count+=i;
		return count;
	}

}
