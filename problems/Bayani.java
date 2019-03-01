import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Bayani {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("bayani.dat"));
        double total = 0;
        while(in.hasNext()) {
            double exp = in.nextDouble();
            total += exp;
            out.printf("%8s$%7.2f\n","",exp);
        }
        out.printf("Total = $%7.2f\n",total);

    }
}