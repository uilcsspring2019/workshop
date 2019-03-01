import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Nandita {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("nandita.dat"));
        HashMap<String, String> months = new HashMap<String, String>();
        months.put("JANUARY", "01");
        months.put("FEBRUARY", "02");
        months.put("MARCH", "03");
        months.put("APRIL", "04");
        months.put("MAY", "05");
        months.put("JUNE", "06");
        months.put("JULY", "07");
        months.put("AUGUST", "08");
        months.put("SEPTEMBER", "09");
        months.put("OCTOBER", "10");
        months.put("NOVEMBER", "11");
        months.put("DECEMBER", "12");
        while (in.hasNext()) {
            String dateStr = in.nextLine();
            String[] mdy = dateStr.split("[, ]+");
           
            String m = months.get(mdy[0]);
            int d = Integer.parseInt(mdy[1]);
            String y = mdy[2];

            out.printf("%s/%02d/%s\n", m, d, y.substring(2));
            out.printf("%02d.%s.%s\n",d,m,y);
            out.printf("%s-%s-%02d\n",y,m,d);
            out.println("=====");
            //out.println();
        }
    }

}