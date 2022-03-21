package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        int len =sc.nextInt();
        int[] arr=new int[len];

        System.out.println("Enter values in array");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        ReverseArray_inplace(arr); // return reverse array
        System.out.println("Reverse Array:"+ Arrays.toString(arr));


    }

    static int[] ReverseArray_inplace(int[] arr) {
        int first=0;
        int last=arr.length-1;
        int temp=-1;
        while(first<last){
            temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        return arr;
    }
}
