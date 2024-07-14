import java.util.*;
import java.io.*;
public class TestJava {
    public static void main(String[] args){
        String inputfile ="D:/javacode/test1/src/contact.csv";
        String inputStr;
        Scanner sn;
        try {
            sn = new Scanner(new File(inputfile));
            sn.useDelimiter(",");
            while (sn.hasNext()) {
                System.out.println("Name: " + sn.next());
                System.out.println("Last Name: " + sn.next());
                System.out.println("Phone: " + sn.next());
                System.out.println("email: " + sn.nextLine().substring(1));
                System.out.println(); // blank line
            }
        } catch (FileNotFoundException e) {
            System.err.println("Input file not found: " + inputfile);
            System.exit(0);
        }
    }
}

