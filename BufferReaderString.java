import java.io.*;
class BufferedReaderString
{
    public static void main(String args[ ])throws IOException
    {
        InputStreamReader str2 = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader (str2);
        String str;
        System.out.println("Enter a string : ");
        str = bf.readLine();
        int len = str.length(), vow = 0, totchar = 0, spaces=0;

        str=str.toLowerCase();

        for (int i=0; i<len; i++)
        {
            char ch = str.charAt(i);
            if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vow=vow+1;
            }

            else if(ch>='a' && ch<='z'){
                totchar=totchar+1;
            }

            else if(ch==' '){
                spaces=spaces+1;
            }
        }

        String begin="The beginning ";
        String end=" The end";
        spaces=spaces+1;

        System.out.println("No. of vowels = "+vow);
        System.out.println("No. of consonants = "+totchar);
        System.out.println("No. of spaces = "+spaces);
        System.out.println("No. of words present= "+spaces);
        str=begin.concat(str);
        System.out.println("After adding 'the beginning' to the string: \n"+str);
        str=str.concat(end);
        System.out.println("After adding 'the end' to the string: \n"+str);
        spaces=spaces+4;
        System.out.println("No. of words after appending is: \n"+spaces);
    }
}