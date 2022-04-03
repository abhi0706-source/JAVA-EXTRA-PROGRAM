
/*6. Write a simple java application that defines a class Student with roll_no(int),
name(String), address(String) & branch(String) as data fields. The class should have
getData() & showData() methods. The program should create an array of Student
objects, get the details and display it. Create branch_dis(student[] s) method to display
all objects having computer branch.*/

import java.util.Scanner;

public class Ex5f {
    static class Student {
        int roll_no; // data fields
        String name, address, branch;
        Scanner s = new Scanner(System.in);

        public Student() {
        }

        public void getData(int roll_no, String name, String address, String branch) {
            this.roll_no = roll_no;
            this.name = name; // getData() method
            this.address = address;
            this.branch = branch;
        }

        public void showData() {
            System.out.println("Data Of The Students:");

            System.out.println("***************************************************");
            System.out.println("Roll Number:" + " " + this.roll_no); // showData method
            System.out.println("Name:" + " " + this.name);
            System.out.println("Address:" + " " + this.address);
            System.out.println("Branch:" + " " + this.branch);

        }

        Student(int roll_no, String name, String address, String branch) {
            this.roll_no = roll_no;
            this.name = name;
            this.address = address;
            this.branch = branch;
        }

        // branch_dis(student[] s) method to display all objects having computer branch.
        public void branch_dis(Student[] s) {
            System.out.println("Students Who are belong to the Branch Computer");
            for (int i = 0; i < 5; i++) {
                if (s[i].branch == "Computer") {

                    System.out.println("***************************************************");
                    System.out.println("Roll Number: " + " " + s[i].roll_no);
                    System.out.println("Name: " + " " + s[i].name);
                    System.out.println("Address: " + " " + s[i].address);
                    System.out.println("Branch: " + " " + s[i].branch);
                }
            }
        }
    }

    public static void main(String[] args) {
        Student myObj = new Student();
        Student s[] = new Student[5]; // array of Student objects
        myObj.getData(30, "Abhishek", "Adajan-Surat", "Computer");
        myObj.showData();
        s[0] = new Student(34, "Krish", "Bhatar-Surat", "Computer");
        s[1] = new Student(35, "Sahil", "Althan-Surat", "Automobile"); // get the details
        s[2] = new Student(36, "Varshil", "Althan-Surat", "Computer");
        s[3] = new Student(37, "Sujal", "Bhatar-Surat", "Civil");
        s[4] = new Student(38, "Yash", "Althan-Surat", "Computer");
        myObj.branch_dis(s);
    }
}