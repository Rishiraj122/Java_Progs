import java.util.*;

class MessageSpread{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();

        while(testcase>0){
            int n=sc.nextInt();
            System.out.println((n-1)*2);
            testcase=testcase-1;
        }
    }
}