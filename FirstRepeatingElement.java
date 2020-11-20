import java.util.*;
import java.lang.*;
import java.io.*;

class FirstRepeatingElement {

    public static int indexFinder(int[] arr, int n){

        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<n;i=i+1){
            if(map.containsKey(arr[i])){
                return (map.get(arr[i]));
            }
            else{
                map.put(arr[i],i);
            }
        }
        return -1;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();

        while(testcases-->0){

            int n=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i=i+1){
                arr[i]=sc.nextInt();
            }

            System.out.println(indexFinder(arr,n));

        }

    }
}
