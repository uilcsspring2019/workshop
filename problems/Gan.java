import java.util.*;
import java.io.*;
import static java.lang.Math.PI;
import static java.lang.System.*;
public class Gan {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("gan.dat"));
        out.println("--------------------------------------");
        while(in.hasNext()) {
            int r = in.nextInt();
            double c = 2 * PI * r;
            double a = PI * r * r;
            double sa = 4*PI*Math.pow(r,2);
            double v = 4.0/3.0 * PI * Math.pow(r,3);

            out.printf("%2d%9.1f%9.1f%9.1f%9.1f\n",r,c,a,sa,v);

        }
        out.println("--------------------------------------");
    }
}