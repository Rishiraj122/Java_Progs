import java.util.*;
import java.lang.*;
import java.io.*;

class Anagram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();

        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        
        if(Arrays.equals(arr1, arr2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }


    }
}
