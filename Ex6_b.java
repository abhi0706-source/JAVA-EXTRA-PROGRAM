
//  Write a simple java application that reads marks of five subjects through
// command line arguments and displays the average. The application should
// generate an exception if marks are not in integer format and out of 0-100.

import java.io.IOException;

public class Ex6_b {
    public static void main(String[] args) throws Exception {
        int m1, m2, m3, m4, m5, avg;

        while (true) {
            // Check the that entered number is an Integer or not...
            try {
                int intvalue;
                for (int i = 0; i < args.length; i++) {
                    intvalue = Integer.parseInt(args[i]);
                    // It is return NumberFoormatException.
                    // NumberFormatException is an Checked type Exception.
                }
                break;
            } catch (NumberFormatException e) // IF NumberFormatException is found then it is catch here.
            {
                System.out.println("\nInputed number is not an Integer.");
                System.exit(1);
            }
        }

        try {
            m1 = Integer.parseInt(args[0]);
            m2 = Integer.parseInt(args[1]);
            m3 = Integer.parseInt(args[2]);
            m4 = Integer.parseInt(args[3]);
            m5 = Integer.parseInt(args[4]);

            for (int i = 0; i < args.length; i++) {

                // Checked that entered number is Between 0 to 100 or not.
                if (Integer.parseInt(args[i]) < 0 || Integer.parseInt(args[i]) > 100) {

                    throw new IOException(); // IOException is Checked Exception.
                }
            }

            // If thier is no exception is then find the avg of enterd marks.
            avg = (m1 + m2 + m3 + m4 + m5) / 5;
            System.out.print("\nThe Avg of 5 subject marks is :" + avg);
        }

        catch (IOException e) // IF IOException is found then it is catch here.
        {
            System.out.println("Please enter a marks between 0 to 100");
        }

    }

}
