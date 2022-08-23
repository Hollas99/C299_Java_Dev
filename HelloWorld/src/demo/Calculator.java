package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
    	
        double result = 0;
        Scanner myObj = new Scanner(System.in);
        String method="";
        String[] options = {"A","M","D","S"};
        
        while (!Arrays.asList(options).contains(method)) {
	        System.out.println("Select method:\n Add: A\n Sub: S\n Multiply: M\n Divide: D");
	        method = myObj.nextLine();
        }
        System.out.println("Selected method is: " + method);
        System.out.println("1st number: ");
        int num1 = myObj.nextInt();
        System.out.println("2nd number: ");
        int num2 = myObj.nextInt();
        switch(method){
            case "A": {
                result = method_add(num1, num2);
                break;
            }
            case "S": {
                result = method_subtract(num1, num2);
                break;
            }
            case "M": {
                result = method_multiply(num1, num2);
                break;
            }
            case "D": {
                while(num2 ==  0){
                    System.out.println("2nd number: ");
                    num2 = myObj.nextInt();
                }
                result = method_divide(num1, num2);
                break;
            }
        }
        System.out.println("result: ");
        System.out.println(result);
}
    

    private static int method_add(int num1, int num2) {
        return num1 + num2;
    }

    private static int method_subtract(int num1, int num2) {
        return num1 - num2;
    }

    private static int method_multiply(int num1, int num2) {
        return num1*num2;
    }
    
    private static double method_divide(int num1, int num2) {
        return Math.ceil((double)num1/(double)num2);
    }
}