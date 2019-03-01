import java.util.*;

import static java.lang.System.*;

import java.io.*;

public class Carla {
    public static void main(String[] args) throws IOException {

        String[] rwx = { "---", "--x", "-w-", "-wx", "r--", "r-x", "rw-", "rwx" };

        Scanner in = new Scanner(new File("carla.dat"));
        while (in.hasNext()) {
            String code = in.next();
            String output = "";
            if (code.charAt(0) == 'F')
                output += '-';
            else if (code.charAt(0) == 'D')
                output += 'd';
            else
                output += 'l';
            for (int i = 1; i < 4; i++) {
                int n = Integer.parseInt(code.substring(i, i + 1));
                output += rwx[n];
            }
            out.println(output);
        }

    }
}