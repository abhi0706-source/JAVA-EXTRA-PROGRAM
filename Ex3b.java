
/*
Palindromic prime - A palindromic prime is a prime number and also palindromic.
• For example, 131 is a prime and also a palindromic prime, as are 313 and 757.
• Write a program that displays the first N palindromic prime numbers. :
2 3 5 7 11 101 131 151 181 191
313 353 373 383 727 757 787 797 919 929
*/

import java.util.*;

public class Ex3b {
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
    
        //check that reverse number is same has given number if it is same then that us palidormic prime number.
        if(rev == no)
        {
            return true;
        }
        else
        {
            return false;
        }
       
    }
}
