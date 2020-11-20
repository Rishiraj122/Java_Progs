import java.util.*;
import java.lang.*;
import java.io.*;

interface one{
    public void abc();
}

interface two{
    public void cde();
}

interface three extends one,two{
    public void efg();
}

class child implements three{
    public void abc(){
        System.out.println("Cool");
    }

    public void cde(){
        System.out.println("Noice");
    }

    public void efg(){
        System.out.println("Fantastic");
    }
}

public class InterfaceConcept {
    public static void main(String args[]){
        child obj=new child();
        obj.abc();
        obj.cde();
        obj.efg();
    }
}
