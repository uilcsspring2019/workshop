import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Ralph {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("ralph.dat"));

        // max is 32767

        while (in.hasNext()) {
            String digits = in.next();
            ArrayList<String> digList = new ArrayList<String>();
            boolean ansFound = true;
            for (int i = 0; i < digits.length(); i++) {
                digList.add(digits.substring(i, i + 1));
            }

            String answer = "";
            // find the largest value in diglist, max_d s.t. max_d * 10000 <= 32767
            int currVal = 0;
            for (int mult = 10000; mult >= 1; mult /= 10) {
                int largestIndex = 0;
                String largest = "";

                for (int i = 0; i < digList.size(); i++) {
                    int n = Integer.parseInt(digList.get(i)) * mult + currVal;
                    if (n <= 32767 && digList.get(i).compareTo(largest) > 0) {
                        largestIndex = i;
                        largest = digList.get(i);
                    }
                }

                if (largest.compareTo("") != 0) {// something was found
                    answer += largest;
                    currVal += Integer.parseInt(largest)*mult;
                    digList.remove(largest);
                } else {
                    out.println("EXCEEDS MAX VALUE");
                    ansFound = false;
                }
            }
            if(ansFound)
                out.println(Integer.parseInt(answer));

        }
    }
}