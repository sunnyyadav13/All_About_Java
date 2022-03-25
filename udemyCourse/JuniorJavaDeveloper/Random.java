package udemyCourse.JuniorJavaDeveloper;

import java.util.Arrays;

public class Random {
    public static void main(String[] args) {
        int n= (int)Math.random();
        System.out.println(Math.random()*(6-0+1)+0);
        System.out.println(Math.random()*(6-0+1)+0);
        System.out.println(Math.random()*(6-0+1)+0);
        System.out.println(Math.random()*(1000-111+1)+111);
        System.out.println(Math.random()*(1000-111+1)+111);

        String[][] matrix = { {"a","b","c"},
                {"e","f","g"},
                {"h","i","j"} };

        for (String[] list : matrix) {
            for (int i=list.length-1;i>=0;i--) {
                System.out.print(list[i]);
            }
        }


    }
}
