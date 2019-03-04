import java.util.*;
import java.io.*;
import static java.lang.System.*;
import java.math.BigInteger;

public class Tomas {
    public static void main(String[] args) throws IOException {

        BigInteger[] nums = new BigInteger[51];
        nums[1] = BigInteger.ONE;
        nums[2] = BigInteger.ONE;
        nums[3] = new BigInteger("1");
        for(int i = 4;i<=50;i++) {
            nums[i] = nums[i-1].add(nums[i-2].add(nums[i-3]));
        }

        Scanner in = new Scanner(new File("tomas.dat"));
        while(in.hasNext()) {
            int n = in.nextInt();
            out.println(nums[n]);
        }
    }
}