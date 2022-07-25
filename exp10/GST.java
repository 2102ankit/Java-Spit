package exp10;

public class GST{

    public double calculateGST(int type, double amount){
        double CGST = 5;//
        double SGST = 10;//1
        double UTGST = 12;//2
        double IGST = 15;//3

        if (type==1){
            return amount*CGST/100.0 + amount*SGST/100.0;
        }
        else if (type==2){
            return amount*CGST/100.0 + amount*UTGST/100.0;
        }
        else if (type==3){
            return amount*CGST/100.0 + amount*IGST/100.0;
        }

        return CGST;
    }

}
