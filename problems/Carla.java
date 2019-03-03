import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Carla {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("carla.dat"));
        String[] rwx = { "---", "--x", "-w-", "-wx", "r--", "r-x", "rw-", "rwx" };

        
        while (in.hasNext()) {
            String output = "";
            String code = in.next();
            char first = code.charAt(0);
            switch (first) {
            case ('F'):
                output += "-";
                break;
            case ('D'):
                output += "d";
                break;
            case ('L'):
                output += "l";
                break;
            }

            for(int i = 1;i<=3;i++) {
                int n = Integer.parseInt(code.substring(i,i+1));
                output += rwx[n];
            }
            out.println(output);

        }
    }
}