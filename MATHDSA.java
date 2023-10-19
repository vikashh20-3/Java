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
             String str2="23244444443";


        if(Check(value))
            System.out.println("Yes");
        else
           System.out.println("No");
        check4(str2);
    }


    //divisibility of four


    public static void check4(String str2 ){

         int n= str2.length();

         if(n==0){
             System.out.println("Not Divisible from 4");
         }
         if (n==1){
             if((str2.charAt(0)-'0')%4==0){
                 System.out.println("Divisible by 4");
             }
             else{
                 System.out.println("Not Divisible by 4");
             }
         }

         int last=str2.charAt(n-1)-'0';
        int second_last=str2.charAt(n-2)-'0';

        if((second_last*10+last)%4==0){
            System.out.println("Divisible by 4");
        }else{
            System.out.println("Not Divisible by 4");
        }

    }

    //Divisibility of 7

    public static check7(String str7){

    }
}