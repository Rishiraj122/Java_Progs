import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;

class BigInt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        System.out.println(str);

        BigInteger num=new BigInteger(str);
        BigInteger x=new BigInteger("2");
        BigInteger y=new BigInteger("0");

        if(num.mod(x).equals(y)){
            System.out.println("Even Number");
        }

        else{
            System.out.println("Odd Number");
        }

    }
}