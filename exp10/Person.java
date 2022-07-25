package exp10;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}


class Student extends Person {
    int rollNum;
    String branch;

    public Student(String name, int age, int rollNum, String branch) {
        super(name, age);
        this.rollNum = rollNum;
        this.branch = branch;

    }

    public void display() {
        super.display();
        System.out.println("Roll Number: " + this.rollNum);
        System.out.println("Branch: " + this.branch);
    }
}


class Employee extends Person {
    int ecNo;
    int doj;

    public Employee(String name, int age, int ecNo, int doj) {
        super(name, age);
        this.ecNo = ecNo;
        this.doj = doj;
    }

    public void display() {
        super.display();
        System.out.println("EC Number: " + this.ecNo);
        System.out.println("Date of Joining: " + this.doj);
    }
}


class Staff extends Employee {
    String designation;// Technical and Clerical

    public Staff(String name, int age, int ecNo, int doj, String designation) {
        super(name, age, ecNo, doj);
        this.designation = designation;
    }

    public void display() {
        super.display();
        System.out.println("Designation: " + this.designation);
    }
}


class Faculty extends Employee {
    String designation;// Assistant Professor, Associate Professor and Professor

    public Faculty(String name, int age, int ecNo, int doj, String designation) {
        super(name, age, ecNo, doj);
        this.designation = designation;
    }

    public void display() {
        super.display();
        System.out.println("Designation: " + this.designation);
    }
}
