package exp9;
import java.util.Scanner;

public class Test{
    int days;
    String except;
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Test t = new Test();

        t.except = "Second Vaccine cannot be taken before 84 Days or After 100 Days.\nPlease Enter Valid number of Days !!\n";

        output(t);
    }

    public static void output(Test t){
        int x;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter number of Days between two vaccine doses.");
            t.days = sc.nextInt();

            if (t.days<84 || t.days > 100)
            {throw new Exception(); }
        }
        catch(Exception e){
            System.out.println(t.except);
            System.out.println("Enter:  1 to continue\n\t0 to exit");
            x = sc.nextInt();
            if(x==1)
            {
                output(t);
            }
            else {
                System.out.println("Thank You!");
                //break;
            }
        }

    }
}
