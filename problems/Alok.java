import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Alok {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("alok.dat"));
        int count = 0;
        double total = 0;
        while(in.hasNext()) {
            total += in.nextDouble();
            count++;
        }
        out.printf("$%.2f\n",total);
        out.printf("$%.2f\n",total/count);
    }

}