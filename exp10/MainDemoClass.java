package exp10;

import exp10.Person;
import java.util.Scanner;

public class MainDemoClass {
    public static void main(String[] args) {
        int age, rollNum, ecNo, doj;
        String name, branch, designation;

        Scanner sc = new Scanner(System.in);

        // for Student
        System.out.println("Enter name of Student");
        name = sc.nextLine();

        System.out.println("Enter age of Student");
        age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Roll number of Student");
        rollNum = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Branch of Student");
        branch = sc.nextLine();

        Student stu = new Student(name, age, rollNum, branch);
        stu.display();
        System.out.println("------------------------------------------------\n");

        // for Staff
        System.out.println("Enter name of Staff");
        name = sc.nextLine();

        System.out.println("Enter age of Staff");
        age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter EC number of Staff");
        ecNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Date of Joining of Staff");
        doj = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Designation of Staff(Technical or Clerical)");
        designation = sc.nextLine();

        Staff sta = new Staff(name, age, ecNo, doj, designation);
        sta.display();
        System.out.println("------------------------------------------------\n");

        // for Faculty
        System.out.println("Enter name of Faculty");
        name = sc.nextLine();

        System.out.println("Enter age of Faculty");
        age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter EC number of Faculty");
        ecNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Date of Joining of Faculty");
        doj = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Designation of Faculty(Assistant Professor, Associate Professor and Professor)");
        designation = sc.nextLine();

        Faculty fac = new Faculty(name, age, ecNo, doj, designation);
        fac.display();
        System.out.println("------------------------------------------------\n");

    }
}
