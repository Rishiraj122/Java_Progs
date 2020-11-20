import java.util.*;

class PrintSpaceCombinations{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            String str=sc.nextLine();
            GfG g=new GfG();
            g.printSpace(str);
            System.out.println();
            t=t-1;
        }
    }
}

class GfG{
    void printSpace(String str){
        String temp="";
        pattern(str,temp,0);
    }

    static void pattern(String str,String temp,int i){
        int n=str.length();
        if(i==n-1){
            temp=temp+str.charAt(i);
            System.out.print(temp+"$");
            return;
        }
        else{
            temp=temp+str.charAt(i);
            pattern(str, temp, i+1);
            temp=temp+" ";
            pattern(str,temp,i+1);
        }
    }
}