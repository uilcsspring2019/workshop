import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Walter {

    public static boolean spc(double l, double w, double t) {
        return (l >= 3.5 && l <= 4.25 && w >= 3.5 && w <= 6 && t >= .007 && t <= .016);
    }

    public static boolean lpc(double l, double w, double t) {
        return (l >= 4.25 && l <= 6 && w >= 6 && w <= 11.5 && t >= .007 && t <= .016);
    }

    public static boolean se(double l, double w, double t) {
        return (l >= 3.25 && l <= 6.125 && w >= 5 && w <= 11.5 && t >= .016 && t <= .25);
    }

    public static boolean le(double l, double w, double t) {
        return (l >= 6.125 && l <= 24 && w >= 11 && w <= 18 && t >= .25 && t <= .5);
    }

    public static boolean sp(double l, double w, double t) {
        return (l > 24 && w > 18 && l + 2 * w + 2 * t <= 84);
    }

    public static boolean lp(double l, double w, double t) {
        return (l + 2 * w + 2 * t > 84 && l + 2 * w + 2 * t <= 130);
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("walter.dat"));
        while (in.hasNext()) {
            double l = in.nextDouble();
            double w = in.nextDouble();
            double t = in.nextDouble();
            if (spc(l, w, t))
                out.println("SMALL POST CARD");
            else if (lpc(l, w, t))
                out.println("LARGE POST CARD");
            else if (se(l, w, t))
                out.println("SMALL ENVELOPE");
            else if (le(l, w, t))
                out.println("LARGE ENVELOPE");
            else if (sp(l, w, t))
                out.println("SMALL PACKAGE");
            else if (lp(l, w, t))
                out.println("LARGE PACKAGE");
            else
                out.println("UNMAILABLE");

        }

    }
}