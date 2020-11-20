import java.util.*;
import java.lang.*;
import java.io.*;

class Minimal_Moves_To_Form_A_String{
    public static void main(String argsp[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            String n=sc.next();
            int l=n.length();
            int c=0;
            while(l!=1){
                if(l%2==1){
                    n=n.substring(0,l-1);
                    c=c+1;
                }
                else{
                    if(n.substring(0,l/2).equals(n.substring(l/2,l))){
                        n=n.substring(0, l/2);
                        c=c+1;
                    }
                    else{
                        n=n.substring(0, l-1);
                        c=c+1;
                    }
                }
                l=n.length();
            }
            c=c+1;
            System.out.println(c);
        }
    }
}