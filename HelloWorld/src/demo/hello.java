package demo;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		
		int[] intArray = {1,2,3,4,5};
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		for(int i: intArray) {
			System.out.println(i);
		}
		int i=0;
		do {
			System.out.println(intArray[i]);
			i++;
		}
		while(i>intArray.length);
		
	}
	

}
