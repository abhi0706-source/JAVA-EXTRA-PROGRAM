/*
Write a program that takes two numbers and operator from the user and perform a mathematical operation on entered two numbers.
*/

import java.util.Scanner;

public class P1_ext {
    public static void main(String args[])
    {
        float a,b,ans=0;
        char o;
        System.out.println("\nWe have perform arithmathic operations.");

        Scanner s=new Scanner(System.in);
        System.out.print("\nPlease enter first operand-1 : ");
        a=s.nextFloat();

        System.out.print("\nPlease enter second operand-2 : ");
        b=s.nextFloat();

        System.out.print("\nPlease enter operator('+','-','*','/') :-  ");
        o=s.next().charAt(0);

        System.out.println("You have entered operand-1 is : "+a);
        System.out.println("You have entered operand-2 is : "+b);
        System.out.println("You have entered operator : "+o);

        if(o=='+')
        {
            ans=a+b;
        }
        else if(o=='-')
        {
            ans=a-b;
        }
        else if(o=='*')
        {
            ans=a*b;
        }
        else if(o=='/')
        {
            ans=a/b;
        }
        
        System.out.println("The ans of given operation is : " +ans);
    }    
}
