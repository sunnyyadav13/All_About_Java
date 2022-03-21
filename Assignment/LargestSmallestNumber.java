package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestSmallestNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");

        int len =sc.nextInt();
        int[] arr=new int[len];
        System.out.println("Enter values in array");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int max_no=large_no(arr); // return maximum value
        System.out.println("maximum value:"+max_no);

        int min_no=smaller_no(arr); // return minimum value
        System.out.println("minimum value:"+min_no);
    }

    static int large_no(int[] arr){
        int max=arr[0];

        for(int ele:arr){
            if(ele>max){
                max=ele;
            }
        }
        return max;
    }

    static int smaller_no(int[] arr){
        int min=arr[0];

        for(int ele:arr){
            if(ele<min){
                min=ele;
            }
        }
        return min;
    }
}
