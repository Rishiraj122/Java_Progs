import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.util.*;
import java.io.*;


public class FileWriters{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        DataInputStream dis=new DataInputStream(System.in);
        String arr;
        char beer;
        System.out.println("Enter the name of the file you wanna store");
        arr=sc.next();
        System.out.println(arr);
        try{
            File myfile=new File(arr);
            if(myfile.createNewFile())
            {
                System.out.println("The New File has been created");
            }
            else
            {
                System.out.println("The File Already Existed");
            }
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
            e.printStackTrace();//This is used to get the type of Exception occured
        }
        System.out.println("Enter the data you wanna write in the File?!!!");
        try{
            FileWriter myWriter=new FileWriter(arr);
            System.out.println("Enter @ TO STOP WRITING");
            while((beer=(char)dis.read())!='@')
            {
                myWriter.write(beer);
            }
            myWriter.close();
            System.out.println("The DATA has been Successfully Stored in the FILE");
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
            e.printStackTrace();
        }
        try{
            FileInputStream fis=new FileInputStream(arr);
            while((i=fis.read())!=-1)
            {
                System.out.print((char)i);
            }
        }
        catch(Exception e)
        {
            System.out.println("THis is WORKING");
            e.printStackTrace();
        }
    }
}