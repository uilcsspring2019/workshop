import java.util.*;
import java.io.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Nina {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("nina.dat"));
        int N = in.nextInt();
        int loc = 1;
        while(N-->0) {
            double r = in.nextDouble();
            double s = 2 * r * sin(PI/5);
            double a = (5 * s * s) / (4 * tan(PI/5));
            double p = 5 * s;
            if(a <= 43560) {
                out.printf("LOCATION #%d %.2f %.2f\n",loc,a,p);
            } else {
                out.printf("LOCATION #%d WILL NOT FIT\n",loc);
            }
            loc++;
        }

    }
}