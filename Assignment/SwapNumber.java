package Assignment;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        num1=sc.nextInt();
        System.out.println("Enter num2");
        num2=sc.nextInt();

        swap(num1,num2);
    }

    static void swap(int num1, int num2){
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("num1 after swapping:"+num1);
        System.out.println("num2 after swapping:"+num2);
    }

}
