import java.util.*;


class CountPrimes{

    public int isPrime(int x){
        int temp=0;
        while(x>0){
            int n=x%10;
            if(n==2 || n==3 || n==5 || n==7){
                x=x/10;
            }
            else{
                return 1;
            }
        }
        return 0;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            int n=sc.nextInt();
            int i=1;

            CountPrimes obj=new CountPrimes();

            while(n>0){
                i=i+1;
                if(obj.isPrime(i)==0){
                    n=n-1;
                }
            }

            System.out.println(i);
        }

    }
}