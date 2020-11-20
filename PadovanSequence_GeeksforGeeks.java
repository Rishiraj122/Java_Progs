import java.util.*;

class PadovanSequence_GeeksforGeeks{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases>0){
            int n=sc.nextInt();
            int arr[]=new int[n+1];
            if(n<=2){
                System.out.println("1");
            }
            else{
                arr[0]=arr[1]=arr[2]=1;

                for(int i=3;i<=n;i=i+1){
                    arr[i]=(arr[i-2]+arr[i-3])%1000000007;
                }
                System.out.println(arr[n]);
            }    
            testcases=testcases-1;
        }
    }
}