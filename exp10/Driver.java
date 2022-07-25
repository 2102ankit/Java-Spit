package exp10;
import exp10.GST;
import java.util.*;

public class Driver{

    public static void main(String[] args){
        GST gst = new GST();
        Scanner sc = new Scanner(System.in);
        double amount,amt;
        int type;

        System.out.println("Enter your Amount");
        amount  = sc.nextDouble();

        System.out.println("Enter the type of GST applicable\n1.SGST\n2.UTGST\n3.IGST");
        type = sc.nextInt();

        amt = gst.calculateGST(type, amount);

        System.out.println("GST applicable to you is: "+amt);

    }
}
