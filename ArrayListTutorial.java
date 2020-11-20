import java.util.*;
import java.io.*;
import java.lang.*;

class ArrayListTutorial{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Chocolate");
        list.add("InfinityCoder");
        list.add("LooneyTunes");
        list.add("Ape");
        list.add("Basket");

        list.set(0,"Cupcakes");
        Collections.sort(list);
        list.remove("Basket");

        for(int i=0;i<list.size();i=i+1){
            System.out.println(list.get(i));
        }
    }
}