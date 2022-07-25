package exp9;

/*There is an abstract class Account
Attribute:
Name, Balance, Acc_No

Method:-
Deposit - abstract method, withdraw - abstract method, display - abstract method

Saving Account inherits the Account class and provides the implementation for the methods accordingly

Saving Account class Attribute:-
interestRate, minBalance

Method
addInterest: handle Arithmetic Exception, transfer():

Note:
Balance cannot be less than 0.
In a Saving account if minBalance is set then for that the balance cannot go less than that amount. If it goes, an error must be shown.let the user deposit to or withdraw from the account. For each transaction, a message is displayed to indicate the status of the transaction: successful or failed. In case of failure, the failure reason is reported.

The possible Exceptions are negative-amount-exception (in both deposit and withdraw transaction) and insufficient-amount- exception ( in withdraw transaction).
For the above scenario write an interactive program in Java. Also, show output for different use cases
*/
import java.util.Scanner;

abstract class Account{
    String Name;
    double Balance;
    int AccNo;

    abstract public void deposit();
    abstract public void withdraw();
    abstract public void display();

}

public class SavingAccount extends Account {
    double interestRate;
    double minBalance = 1000.0;
    public void addInterest(){
        Scanner sc = new Scanner(System.in);
        double interest;
        System.out.println("Enter rate of interest:");
        this.interestRate = sc.nextDouble();
        try{
            if (this.interestRate<0)
            {throw new ArithmeticException();	}
        }
        catch(ArithmeticException ae){
            System.out.println("Interest cannot be negative");
            addInterest();
        }
        this.display();
    }

    public void transfer(){
        double transfer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to transfer:");
        transfer = sc. nextDouble();
        if (this.Balance - transfer >= this.minBalance){
            this.Balance -= transfer;
        }
        else
            System.out.println("Amount not sufficient");
        this.display();

    }
    @Override
    public void deposit(){
        double deposit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit:");
        deposit = sc. nextDouble();
        this.Balance += deposit;
        this.display();
    }

    public void withdraw(){
        double withdraw;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw:");
        withdraw = sc. nextDouble();
        if (this.Balance - withdraw >= this.minBalance){
            this.Balance -= withdraw;
        }
        else
            System.out.println("Amount not sufficient");
        this.display();
    }

    public void display(){
        System.out.println("Your Existing Balance is Rs."+this.Balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingAccount s = new SavingAccount();
        s.Balance = 0;

        System.out.println("Welcome to Na Lena Na Dena Bank!");

        System.out.println("Enter Your Name:");
        s.Name = sc.nextLine();

        System.out.println("Enter your 8 digit account number:");
        s.AccNo = sc.nextInt();
        int pin = 0;
        System.out.println("Enter your 4 digit pin:");
        pin = sc.nextInt();

        while(pin!=1090){
            System.out.println("Enter your 4 digit pin:");
            pin = sc.nextInt();
        }
        s.addInterest();

        int x=1;
        while(x!=0){
            System.out.println("1.Deposit\n2.Withdraw\n3.Display Balance\n4.Transfer Amount\n0.Exit");
            x = sc.nextInt();
            switch(x){
                case 1:{s.deposit();break;}
                case 2:{s.withdraw();break;}
                case 3:{s.display();break;}
                case 4:{s.transfer();break;}
                case 0:{break;}
            }

        }
    }

}


