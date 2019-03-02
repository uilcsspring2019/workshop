import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Joaquin {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("joaquin.dat"));
        int N = in.nextInt();
        while (N-- > 0) {
            int size = in.nextInt();
            char[][] grid = new char[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    grid[i][j] = ' ';
                }
            }

            int tp = 0, lt = 0, rt = size - 1, bt = size - 1;
            while (tp <= size / 2) {
                for (int i = tp; i <= rt; i++) {
                    grid[tp][i] = 'X';
                }
                for (int i = tp; i <= bt; i++) {
                    grid[i][rt] = 'X';
                }
                for (int i = rt; i >= lt; i--) {
                    grid[bt][i] = 'X';
                }
                for (int i = bt; i >= tp; i--) {
                    grid[i][lt] = 'X';
                }
                tp += 2;
                lt += 2;
                rt -= 2;
                bt -= 2;
            }

            for (char[] row : grid) {
                for (char c : row) {
                    out.print(c);
                }
                out.println();
            }
            out.println("--------------------");

        }
    }
}