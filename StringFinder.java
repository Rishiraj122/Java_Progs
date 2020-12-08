import java.util.*;
import java.io.*;
import java.lang.*;

class StringFinder {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        int vowels=0,consonants=0,spaces=0;

        for(int i=0;i<str.length();i=i+1){
            char finder=str.charAt(i);

            if(finder=='a' || finder=='e' || finder=='i' || finder=='o' || finder=='u'){
                vowels=vowels+1;
            }

            else if(finder>='a' && finder<='z'){
                consonants=consonants+1;
            }

            else if(finder==' '){
                spaces=spaces+1;
            }

        }

        System.out.println("No. of Vowels:"+vowels);
        System.out.println("No. of Consonants"+consonants);
        System.out.println("No. of Spaces"+spaces);

        if(str.indexOf("the")!=-1){
            System.out.println("The substring 'the' is present");
        }
        else{
            System.out.println("The substring 'the' isn't presnet");
        }

    }
}
