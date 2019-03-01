import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Max {
    public static void main(String[] args) throws IOException {
        HashMap<Character,String> ph = new HashMap<Character,String>();
        ph.put('A',"Alpha");
        ph.put('B',"Bravo");
        ph.put('C',"Charlie");
        ph.put('D',"Delta");
        ph.put('E',"Echo");
        ph.put('F',"Foxtrot");
        ph.put('G',"Golf");
        ph.put('H',"Hotel");
        ph.put('I',"India");
        ph.put('J',"Juliet");
        ph.put('K',"Kilo");
        ph.put('L',"Lima");
        ph.put('M',"Mike");
        ph.put('N',"November");
        ph.put('O',"Oscar");
        ph.put('P',"Papa");
    ph.put('Q',"Quebec");
        ph.put('R',"Romeo");
        ph.put('S',"Sierra");
        ph.put('T',"Tango");
        ph.put('U',"Uniform");
        ph.put('V',"Victor");
        ph.put('W',"Whiskey");
        ph.put('X',"Xray");
        ph.put('Y',"Yankee");
        ph.put('Z',"Zulu");
        ph.put('0',"Zero");
        ph.put('1',"Wun");
        ph.put('2',"Too");
        ph.put('3',"Tree");
        ph.put('4',"Fower");
        ph.put('5',"Fife");
        ph.put('6',"Six");
        ph.put('7',"Seven");
        ph.put('8',"Ait");
        ph.put('9',"Niner");

        Scanner in = new Scanner(new File("max.dat"));
        while(in.hasNext()) {
            String word = in.next();
            String output = "";
            for(int i = 0; i < word.length(); i++) {
                output += ph.get(word.charAt(i)) + " ";
            }
            out.println(output);


        }

    }
}