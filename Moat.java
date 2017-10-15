
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laila
 */
public class Moat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner asdf = new Scanner(new File("moat.in"));
        int x = asdf.nextInt();
        for (int i = 0; i <= x; i++) {
            int sum = 0;
            String b = asdf.nextLine();
            String[] a = b.split("");
            for (int j = 1; j < a.length-1; j++) {
                if(a[j].equals("A")){
                    sum+=15;
                }
                else if(a[j].equalsIgnoreCase("J")||a[j].equalsIgnoreCase("Q")||a[j].equalsIgnoreCase("K")){
                    sum+=12;
                }
                else if(a[j].equals("0")){
                    sum+=10;
                    
                }
                else if(a[j].equals("C")||a[j].equals("D")||a[j].equals("H")||a[j].equals("S")){
                    sum+=0;
                }
                else
                    sum+=Integer.parseInt(a[j]);
            }
        System.out.println(sum);            
        }

    }
    
}
