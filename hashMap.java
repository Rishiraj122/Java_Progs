import java.util.*;
import java.io.*;
import java.lang.*;

class hashMap {
    public static void main(String args[]){
        HashMap<String, Integer> map=new HashMap<>();
        map.put("Chisi",10);
        map.put("pingu",12);
        map.put("tingu mingu",77);

        System.out.println("Size of my map is: "+ map.size());

        if(map.containsKey("pingu")){
            System.out.println(map.get("pingu"));
        }

        //Traverse through it

        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey()+ " " + e.getValue());
        }

    }
}
