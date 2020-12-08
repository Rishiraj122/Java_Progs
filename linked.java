import java.util.*;
import java.io.*;
import java.lang.*;

public class linked {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> li=new LinkedList<Integer>();
        li.add(3);
        li.add(4);
        li.add(5);

        for(int i=0;i<li.size();i=i+1){
            System.out.println(li.get(i));
        }
        System.out.println("The Size of The LinkedList is:");
        System.out.println(li.size());
    }
}
