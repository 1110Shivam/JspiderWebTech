import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the CP:");
        int cp = sc.nextInt();        
        System.out.println("Enter the SP:");
        int sp = sc.nextInt();        

        if (sp>cp) {
            System.out.println("this is a profit");
            double profit = sp-cp;
            double pre = (double)(profit*100)/cp;
            System.out.println("profit precentage"+pre);

        }
        else if (cp > sp )
        {
            System.out.println("this is loss");
            double loss = cp-sp;
            double lossper = (double)(loss*100)/cp;
            System.out.println("this is loss "+ lossper);
        } 
        else{
                System.out.println("this is no profit no loss");
        }
        sc.close();
        
    }
}