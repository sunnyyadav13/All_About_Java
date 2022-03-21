package Assignment;

import java.util.HashMap;
import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        int[] arr=new int[sc.nextInt()];
        System.out.println("Enter values in array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Sum");
        int sum=sc.nextInt();
        pairSumArray(arr,sum);

    }
    static void pairSumArray(int[] arr,int sum){      //5 3 7 4 1
        HashMap<Integer,Integer> mp=new HashMap<>();  // (3 1, 5 1, 7 1, 4 1, 1

        for(int i=0;i<arr.length;i++){
            int check_no=sum-arr[i]; //8-5 =3
            if(mp.containsKey(check_no)){
                for(int j=0;j<mp.get(check_no);j++){
                    System.out.println("("+arr[i]+", "+check_no+")");
                }

            }
            else if(mp.containsKey(arr[i])){
                    mp.put(arr[i],mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i],1);
            }

        }

    }
}
