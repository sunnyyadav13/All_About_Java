package udemyCourse;

import java.util.Scanner;

public class sumN {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(SUMVALUE(n));
    }

    static int SUMVALUE(int n) {
        int sum = 0;
        int i;
        for (i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}

