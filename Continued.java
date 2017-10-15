
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
public class Continued {


    public static void main(String[] args) throws FileNotFoundException {
       Scanner asdf = new Scanner(new File("continued.in"));
       while (asdf.hasNextLine())
       {
       int a = asdf.nextInt();
       int b = asdf.nextInt();
       while(b!=0)
       {
       int c = a/b;
           System.out.print(c + " ");
       int d = a%b;
       a = b;
       b = d;
       
       }
           System.out.println("");
    }
       
    }
    
}
