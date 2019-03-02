import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Yash {

    // used for alternate method below
    public static int log2(int n) {
        int ans = 0;
        while(n > 0) {
            n /= 2;
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("yash.dat"));
        while(in.hasNext()) {
            int n = in.nextInt();
            int logn = (int)Math.ceil((Math.log(n)/Math.log(2)));  // my preferred method, yay math!
            //int logn = log2(n);  // alternate method
            out.printf("%,d %,d %,d %,d %,d\n",1,logn,n,n*logn,n*n);
        }
    }
}