import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FiloWriteDemo {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        PrintWriter outfile = new PrintWriter("names.txt");
        int i=0;
        while(i<10) {
            System.out.println("Enter a  name");
            String name = input.next();
            outfile.println();
            outfile.close();
            i++;

        }
    }
}
