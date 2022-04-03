
/*
3. Write a simple java application that declares Employee class. The program should
generate and handle custom exceptions such as
a) InvalidEmailAddressException if the address does not contain . and @ 
b) InvalidTelephoneNumberException if total no of digits > 10.
*/

import java.security.spec.EncodedKeySpec;
import java.util.Scanner;
import java.lang.Throwable;

public class Ex6_c {
    public static void main(String[] args) {

        String s, num;
        // Create a object of Employee class.
        Employee emp = new Employee();

        Scanner in = new Scanner(System.in);

        // Take a mail id from user.
        System.out.print("\nPlease enter your mail id :");
        s = in.nextLine();
        emp.emailcheck(s);

        // Take a Phone number from user.
        System.out.print("\nPlease enter your Telephone number :");
        num = in.nextLine();
        emp.numbercheck(num);

    }
}

// Employee class...
class Employee {
    private String email, number;

    // Defult Constructor...
    public Employee() {

    }

    // Checked that mail id is correct or not.
    public void emailcheck(String s) {
        this.email = s;
        try {
            if (email.indexOf('@') == -1) // checked that mail id contain @ sign or not...
            {
                // Throw the User define InvalidEmailAddressException.
                throw new InvalidEmailAddressException("Worng mail id...");
            } else {
                System.out.println("Your mail id is correct...");
            }
        }

        // Catch the user define InvalidEmailAddressException.
        catch (InvalidEmailAddressException ex) {
            System.out.print("Exception :" + ex.getMessage());
            System.out.println("\nPlease enter mail id with the @ sign....");
            System.exit(1);
        }
    }

    // Checked that Phone number is correct or not.
    public void numbercheck(String num) {
        this.number = num;
        try {
            if (number.length() > 10) {
                // Throw the User define InvalidTelephoneNumberException.
                throw new InvalidTelephoneNumberException("Worng number...");
            } else {
                System.out.println("Your number is correct...");
            }
        }
        // Catch the user define InvalidTelephoneNumberException.
        catch (InvalidTelephoneNumberException ex) {
            System.out.print("Exception :" + ex.getMessage());
            System.out.println("\nPlease enter a valid...");
            System.exit(2);
        }
    }

}

/*
 * User define Exception class to checked that
 * there is any kind of Exception is in mail id.
 */
class InvalidEmailAddressException extends Exception {

    public InvalidEmailAddressException() {

    }

    public InvalidEmailAddressException(String str) {
        super(str);
    }
}

/*
 * User define Exception class to checked that
 * there is any kind of Exception is in number.
 */
class InvalidTelephoneNumberException extends Exception {

    public InvalidTelephoneNumberException() {

    }

    public InvalidTelephoneNumberException(String str) {
        super(str);
    }
}
