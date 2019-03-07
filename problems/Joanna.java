import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Joanna {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("joanna.dat"));
        int n = in.nextInt();
        while(n-->0) {
            double payRate = in.nextDouble();
            double hours = in.nextDouble();
            double ltPrice = in.nextDouble();
            double accPrice = in.nextDouble();
            double salesTax = in.nextDouble();

            double weeklyGross = payRate * hours;
            double weeklyNet = weeklyGross*(1-.0765);

            weeklyNet = Math.round(weeklyNet * 100) / 100.0;
            double totalNet = weeklyNet * 10;

            double cost = ltPrice + accPrice;
            double tax = cost * salesTax/100.0;
            tax = Math.round(tax * 100) / 100.0;

            double purch = cost + tax;

            out.printf("Net Pay:  $%,8.2f\n",totalNet);
            out.printf("Purchase: $%,8.2f\n",purch);
            out.printf("Fun Cash: $%,8.2f\n",totalNet - purch);
            out.println("---------");

            

        }


    }
}