import java.util.*;

class LargestTime{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int [] arr = new int[4];
        for(int i=0;i<4;i=i+1){
            arr[i]=sc.nextInt();
        }

        Cool obj=new Cool();
        for(int i=0;i<4;i=i+1){
            obj.wowmethod(arr[i]);
        }
    }
}

class Cool{
    public void wowmethod(int n){
        if(n==2){
            System.out.println("Wow");
        }
    }
}