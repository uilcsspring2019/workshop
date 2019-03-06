import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class Yash {

    public static int log2(int n) {
        int count = 0;
        while(n > 0) {
            n /= 2;
            count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("yash.dat"));
        while(in.hasNext()) {
            int n = in.nextInt();
            out.printf("%,d %,d %,d %,d %,d\n",1,log2(n),n,n*log2(n),n*n);
        }

    }
}