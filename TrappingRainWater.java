import java.util.*;
import java.lang.*;
import java.io.*;

class TrappingRainWater {
    
    public static int rainWater(int arr[], int N){
        int res=0;

        for(int i=1;i<N-1;i=i+1){
            int left=arr[i];
            int right=arr[i];

            for(int j=0;j<i;j=j+1){
                left=Math.max(left,arr[j]);
            }

            for(int k=i+1;k<N;k=k+1){
                right=Math.max(arr[k],right);
            }

            res=res+Math.min(left,right)-arr[i];

        }

        return res;

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();

        while(testcases-->0){

            int N=sc.nextInt();
            int[] arr=new int[N];

            for(int i=0;i<N;i=i+1){
                arr[i]=sc.nextInt();
            }

            System.out.println(rainWater(arr,N));
        
        }

    }
}


///*package whatever //do not write package name here */
//This is another method!!!
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class GFG {
    
//     static int AmountofWater(int[] arr, int N){
//         int res=0;
//         int[] left=new int[N];
//         int[] right=new int[N];
//         left[0]=arr[0];
        
//         for(int i=1;i<N;i=i+1){
//             left[i]=Math.max(left[i-1],arr[i]);
//         }
        
//         right[N-1]=arr[N-1];
//         for(int i=N-2;i>=0;i=i-1){
//             right[i]=Math.max(right[i+1],arr[i]);
//         }
        
//         for(int i=0;i<N;i=i+1){
//             res=res+Math.min(left[i],right[i])-arr[i];
//         }
        
//         return res;
        
//     }
    
// 	public static void main (String[] args) {
// 		//code
// 	    Scanner sc=new Scanner(System.in);
// 	    int testcases=sc.nextInt();
	    
// 	    while(testcases-->0){
// 	        int N=sc.nextInt();
// 	        int[] arr=new int[N];
	        
// 	        for(int i=0;i<N;i=i+1){
// 	            arr[i]=sc.nextInt();
// 	        }
	        
// 	        int ans=AmountofWater(arr,N);
	        
// 	        System.out.println(ans);
	        
// 	    }
	    
// 	}
// }