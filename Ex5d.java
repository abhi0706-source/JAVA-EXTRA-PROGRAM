
/*4. Create a class called Time containing followings:
Two private data fields Hour and Minute.
No-argument constructor and parameterized constructor
A method gettime() that asks the user to enter the values of both fields
A method ahead() which displays which object is ahead from other
A method add() that performs addition of two objects and returns a third
object
A method showtime() to display time object*/

import java.util.Scanner;

public class Ex5d {
    static class Time {
        Scanner s = new Scanner(System.in);
        private int Hour, Minute; // Data fields

        public Time() {
            // no-arg constructor
        }

        public Time(int x, int y) {
            this.Hour = x; // parameterized constructor
            this.Minute = y;
        }

        public void gettime() {
            System.out.println("**********************************************");
            System.out.println("Enter Values of Hour and Minutes:"); // User will enter values
            Hour = s.nextInt();
            Minute = s.nextInt();
        }

        public void ahead(int a, int b, int c, int d) {
            if (a > c) {
                System.out.println("**********************************************");
                System.out.println("First object is ahead of other");
                System.out.println("**********************************************");

            }
            if (a < c) {
                System.out.println("**********************************************");
                System.out.println("Second object is ahead of other");
                System.out.println("**********************************************");
            }
            if (a == c) {
                if (b > d) {
                    System.out.println("**********************************************");
                    System.out.println("First object is ahead of other");
                    System.out.println("**********************************************");
                } else {
                    System.out.println("**********************************************");
                    System.out.println("Second object is ahead of other");
                    System.out.println("**********************************************");
                }
            }
        }

        public Time add(Time myObj, Time myObj1) {
            Time sum = new Time();
            sum.Hour = myObj.Hour + myObj1.Hour;
            sum.Minute = myObj.Minute + myObj1.Minute;
            if (sum.Hour > 12) {
                sum.Hour = sum.Hour - 12;
            }
            if (sum.Minute > 60) {
                sum.Minute = sum.Minute - 60;
                sum.Hour++;
            }
            return sum; // returning object
        }

        public void showTime() {
            System.out.println(this.Hour + ":" + this.Minute); // Displaying Object
        }
    }

    public static void main(String[] args) {
        Time myObj = new Time(2, 32);
        Time myObj1 = new Time(2, 42);
        Time myObj2 = new Time();
        myObj2.gettime();
        myObj2.ahead(myObj.Hour, myObj.Minute, myObj1.Hour, myObj1.Minute);
        myObj2 = myObj2.add(myObj, myObj1);
        System.out.println("Passing First Object as 2:32");
        System.out.println("Passing First Object as 2:42");
        System.out.print("Total Time:");

        myObj2.showTime();
    }
}