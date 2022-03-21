package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String");
        String str =sc.nextLine();
        str.strip();

        String result=ReverseWords_string(str);
        System.out.println(result);

    }
    static String ReverseWords_string(String str){
        int i=0;
        int n=str.length();
        String res="";
        while(i<n){
            while(i<n && str.charAt(i)==' ') i++;
            if(i>=n) break;
            int j=i+1;
            while(j<n && str.charAt(j) !=' ') j++;
            String sub= str.substring(i,j);

            if(res.isEmpty()){
                res=sub;
            }else{
                res=sub+" "+res;
            }
            i=j+1;

        }
        return res;
    }
}
