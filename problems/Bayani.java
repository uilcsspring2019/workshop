import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Bayani {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("bayani.dat"));
        double total = 0; // accumulate expenses
        while(in.hasNext()) {
            double expense = in.nextDouble();
            total += expense;
            out.printf("        $%7.2f\n",expense);
        }
        out.printf("Total = $%7.2f\n",total);
    }
}