import java.util.*;
import java.io.*;

import static java.lang.System.*;

public class Diya {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("diya.dat"));
        while(in.hasNext()) {
            int n = in.nextInt();

            int[][] mat = new int[n][n];

            int val = 1;
            int top=0, left = 0;
            int bot=n-1, right = n-1;
            while(val <= n * n) {
                for(int i = top;i<=right;i++) {
                    mat[top][i] = val++;
                } 
                top++;

                for(int i = top; i <=bot;i++) {
                    mat[i][right] = val++;
                }
                right--;

                for(int i = right;i>=left;i--) {
                    mat[bot][i] = val++;
                }
                bot--;

                for(int i = bot;i>=top;i--) {
                    mat[i][left] = val++;
                }
                left++;
                
            }

            int width = (n*n + " ").length();

            for(int[] row: mat) {
                for(int num:row) {
                    out.printf("%-"+width+"d",num);
                }
                out.println();
            }
            out.println("=====");
        }
    }
}