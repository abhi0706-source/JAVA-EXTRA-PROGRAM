
/*
Emirp - An emirp (prime spelled backward) is a nonpalindromic prime number whose
reversal is also a prime.
• For example, 17 is a prime and 71 is a prime, so 17 and 71 are emirps.
• Write a program that displays the first N emirps.
13 17 31 37 71 73 79 97 107 113
149 157 167 179 199 311 337 347 359 389
*/

import java.util.*;
public class Ex3c{
    
    public static void main(String[] args) {
        int num;
        
        Scanner in=new Scanner(System.in);
        System.out.print("\nPlease enter your range number : ");
        num=in.nextInt();

        for(int i=0;i<num;i++)
        {
            //Check that number is palindromic prime.
            if(palindromicprime(i))
            {
                System.out.println("\n"+i);
            }
        }
        
    }

    static boolean palindromicprime(int no){

        //check number is prime and palindromic.
        if(isprime(no) &&  isPalindromic(no))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static boolean isprime(int no){
        int i=0,c=0;
        //finding prime is number.
        for(i=2;i<no;i++)
        {
            if(no%i==0)
            {
                c++;
            }
        }

        //return statement.
        if(c==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static boolean isPalindromic(int no){
        int rem,rev=0,x;
        x=no;
        //find the reverse of given number.
        while(x!=0)   
        {  
            rem = x % 10;  
            rev = (rev * 10) + rem;  
            x= x / 10;
        }
    
        //check that reverse number is same has given number if it is same then that us palidormic prime number otherwise not palindromic.
        if(rev != no && isprime(rev))
        {
            return true;
        }
        else
        {
            return false;
        }
       
    }

}
