import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Nandita {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("nandita.dat"));

        HashMap<String,Integer> months = new HashMap<String,Integer>();
        months.put("JANUARY",1);
        months.put("FEBRUARY",2);
        months.put("MARCH",3);
        months.put("APRIL",4);
        months.put("MAY",5);
        months.put("JUNE",6);
        months.put("JULY",7);
        months.put("AUGUST",8);
        months.put("SEPTEMBER",9);
        months.put("OCTOBER",10);
        months.put("NOVEMBER",11);
        months.put("DECEMBER",12);

        while(in.hasNext()) {
            String m = in.next();
            String d = in.next();
            String y = in.next();

            int mon = months.get(m);
            int day = Integer.parseInt(d.substring(0,d.length()-1));

            out.printf("%02d/%02d/%s\n",mon,day,y.substring(2));
            out.printf("%02d.%02d.%s\n",day,mon,y);
            out.printf("%s-%02d-%02d\n",y,mon,day);
            out.println("=====");

        }

    }
}