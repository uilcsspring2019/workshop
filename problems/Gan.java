import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Gan {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("gan.dat"));
        out.println("--------------------------------------");
        while(in.hasNext()) {
            int radius = in.nextInt();
            double circ = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;
            double sa = 4 * area;
            double v = 4.0 / 3 * Math.PI * Math.pow(radius,3);
            out.printf("%2d%9.1f%9.1f%9.1f%9.1f\n",radius,circ,area,sa,v);
        }
        out.println("--------------------------------------");
    }
}