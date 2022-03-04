/*
Write a program to find the factorial of given number. Take number through command line argument.
*/

public class P2_ext {
    
   public static void main(String[] args) 
    {
        
        int i=1,f=1,x;
        x=Integer.parseInt(args[0]);

        System.out.println("\nWe are going to find factorial of given number.");


        for(i=1;i<=x;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial of "+x+" is : "+f);
        
    }
    
}
