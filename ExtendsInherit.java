import java.util.*;
import java.lang.*;
import java.io.*;

class one{
    public void abc(){
        System.out.println("Hey");
    }
}

class two extends one{
    public void cde(){
        System.out.println("Wow");
    }
}

public class ExtendsInherit {
    public static void main(String args[]){
        two obj=new two();
        obj.abc();
        obj.cde();
        obj.abc();
    }
}
