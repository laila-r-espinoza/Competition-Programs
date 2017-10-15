
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
public class Chevron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       Scanner asdf = new Scanner(new File("chevron.in"));
       int x = asdf.nextInt();
        for (int i = 0; i <= x; i++) {
            String a = asdf.nextLine();
            if(a.equals("sergeant chevron")){
                System.out.println("**         **");
                System.out.println(" **       **");
                System.out.println("  **     **");
                System.out.println("** **   ** **");
                System.out.println(" ** ** ** **");
                System.out.println("  ** *** **");
                System.out.println("** ** * ** **");
                System.out.println(" ** ** ** **");
                System.out.println("  ** *** **");
                System.out.println("   ** * **");
                System.out.println("    ** **");
                System.out.println("     ***");
                System.out.println("      *");
                
            }
            if(a.equals("sergeant chevronel")){
                System.out.println("*       *");
                System.out.println(" *     *");
                System.out.println("* *   * *");
                System.out.println(" * * * *");
                System.out.println("* * * * *");
                System.out.println(" * * * *");
                System.out.println("  * * *");
                System.out.println("   * *");
                System.out.println("    *");
                
                
            }
            if(a.equals("corporal chevronel")){
                System.out.println("*       *");
                System.out.println(" *     *");
                System.out.println("  *   *");
                System.out.println("   * *");
                System.out.println("    *");
                
            }
            if(a.equals("corporal chevron")){
                System.out.println("**         **");
                System.out.println(" **       **");
                System.out.println("  **     **");
                System.out.println("   **   **");
                System.out.println("    ** **");
                System.out.println("     ***");
                System.out.println("      *");
                
                
                
            }
            if(a.equals("lance chevronel")){
                System.out.println("*       *");
                System.out.println(" *     *");
                System.out.println("* *   * *");
                System.out.println(" * * * *");
                System.out.println("  * * *");
                System.out.println("   * *");
                System.out.println("    *");
            }
            if(a.equals("lance chevron")){
                System.out.println("**         **");
                System.out.println(" **       **");
                System.out.println("  **     **");
                System.out.println("** **   ** **");
                System.out.println(" ** ** ** **");
                System.out.println("  ** *** **");
                System.out.println("   ** * **");
                System.out.println("    ** **");
                System.out.println("     ***");
                System.out.println("      *");
                
            }
            
            
            
        }
    }
    
}
