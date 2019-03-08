import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Raghav {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("raghav.dat"));
        int[] nums = new int[51];
        for (int i = 1; i <= 50; i++) {
            nums[i] = in.nextInt();
        }

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                nums[i] *= 2;
            } else {
                nums[i] += 7;
            }

            if (i % 3 == 0) {
                nums[i] *= 5;
            }

            if (i % 5 == 0) {
                nums[i] -= 11;
            }

            if (i % 7 == 0) {
                nums[i] *= nums[i];
            }

            if (i % 10 == 0) {
                nums[i] /= 10;
            }

            if (i % 11 == 0) {
                nums[i] = (int) Math.sqrt(nums[i]);
            }

        }

        for(int i = 1; i<=50;i++) {
            out.println(nums[i]);
        }

    }
}