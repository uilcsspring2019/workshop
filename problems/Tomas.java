import java.util.*;
import java.io.*;
import java.math.BigInteger;
import static java.lang.System.*;

public class Tomas {
    public static void main(String[] args) throws IOException {
        BigInteger[] pattern = new BigInteger[51];
        pattern[1] = BigInteger.ONE;
        pattern[2] = BigInteger.ONE;
        pattern[3] = new BigInteger("1"); // does the same thing as BigInteger.ONE
        for(int i = 4;i<=50;i++) {
            pattern[i] = pattern[i-1].add(pattern[i-2].add(pattern[i-3]));
        }
        
        Scanner in = new Scanner(new File("tomas.dat"));
        while(in.hasNext()) {
            int n = in.nextInt();
            out.println(pattern[n]);
        }
    }
}