import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Vlad {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("vlad.dat"));
        
        ArrayList<String> names = new ArrayList<String>();

        while(in.hasNext()) {
            String line = in.nextLine();

            if(line.charAt(line.length()-1)=='.') { // there is a middle initial
                int lastIdx = line.indexOf(" ")+1;
                int firstIdx = line.indexOf(" ",lastIdx)+1;
                int midIdx = line.indexOf(" ",firstIdx)+1;
                String last = line.substring(lastIdx,firstIdx-2);
                String first = line.substring(firstIdx,midIdx-1);
                String mid = line.substring(midIdx,midIdx+1);

                names.add(last + " " + first + " " + mid);
            } else {
                int lastIdx = line.indexOf(" ")+1;
                int firstIdx = line.indexOf(" ",lastIdx)+1;
                String last = line.substring(lastIdx,firstIdx-2);
                String first = line.substring(firstIdx);
                names.add(last + " " + first);
            }

        }

        Collections.sort(names);
        for(String name: names) {
            int spaceIdx = name.indexOf(" ");
            String temp = name.substring(spaceIdx+1) + " " + name.substring(0,spaceIdx);
            out.println(temp);

        }


    }
}