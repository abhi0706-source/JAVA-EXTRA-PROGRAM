/*
Game: craps - Craps is a popular dice game played in casinos. Write a program to play a
variation of the game, as follows:
Roll two dice. Each die has six faces representing values 1, 2, ..., and 6, respectively. Check
the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you lose; if the sum is 7 or 11
(called natural), you win; if the sum is another value (i.e., 4, 5, 6, 8, 9, or 10), a point is
established. Continue to roll the dice until either a 7 or the same point value is rolled. If 7 is
rolled, you lose. Otherwise, you win. Your program acts as a single player.
Here are some sample runs.
You rolled 5 + 6 = 11
You win
-----------------------------
You rolled 1 + 2 = 3
You lose
-----------------------------
You rolled 4 + 4 = 8
point is 8
You rolled 6 + 2 = 8
You win
-----------------------------
You rolled 3 + 2 = 5
point is 5
You rolled 2 + 5 = 7
You lose
*/

import java.util.Random;
import java.util.Scanner;

public class Ex3a{

    public static void main(String[] args) {

        int x=0,y=0,z=0,a=0;

        //Create random class object.
        Random r= new Random();

        x=1+r.nextInt(6);
        System.out.println("\nFirst dies value is :"+x);

        y=1+r.nextInt(6);

        System.out.println("\nSecond dies value is :"+y);
        z=x+y;

        System.out.println("\nSum of two dies value is :"+z);

            if(z==2 || z==3 || z==12)
            {
                //called craps and loss.
                System.out.println("\nYou are craps.\nYou loss. ");
                
            }
            else if(z==7 || z==11 )
            {
                //called Natural and win. 
                System.out.println("\nYou are natural.\nYou win. "); 
                
            }
            else
            {
                //checked after the first die is another between 4, 5, 6, 8, 9, or 10.
                System.out.println("\n*******************************");
                a=z;
                while(true)
                {
                    x=1+r.nextInt(6);

                    y=1+r.nextInt(6);

                    z=x+y;

                    System.out.println("\nFirst dies value is :"+x);
                    System.out.println("\nSecond dies value is :"+y);
                    System.out.println("\nSum of two dies value is :"+z);

                    if(z==7)
                    {
                        System.out.println("You loss.");
                        break;
                    }
                    else if(z==a)
                    {
                        System.out.println("You win.");
                        break;
                    }

                }
            }

        
    }
}