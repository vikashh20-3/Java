import java.io.*;

class Main{
        static boolean Check(String value){
            int n =value.length();
            int digitSum=0;
            for(int i=0;i<n;i++){
                digitSum+=(value.charAt(i)-'0');

            }
            return  (digitSum %3 ==0);
        }
    public static void main(String[] args){
             String value= "232";


        if(Check(value))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}