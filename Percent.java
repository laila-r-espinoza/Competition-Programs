

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Laila
 */
public class Percent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner asdf = new Scanner(new File("percent.dat"));
        int x = asdf.nextInt();
        for (int i = 0; i < x; i++) {
            double num = asdf.nextDouble();
            num*=100;
            System.out.printf("%.1f",(num));
            System.out.print("%");
            System.out.println("");
            
        }
    }
    
}
