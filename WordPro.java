
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordPro {
    
    public static void main(String[] args) throws FileNotFoundException {
       Scanner asdf = new Scanner(new File("word.in"));
       while(asdf.hasNext()){
       double n = asdf.nextDouble();
       double t = Math.ceil((n/3)*2);
       double hand = 0;
       double type = 0;
       
       if(n>=100)
       {
           hand += n*.08;
       }
       
      else  if(n>40 && n<100)
       {
           hand += (40*.1);
           hand += (n-40)*.09;
       }
       else
       {
           hand += n*.1;
       }
       
        
            if(t>50)
            {
                type+= (50*.35);
                type+= ((t-50)*.27);
            }
            else
            {
                type+= (t*.35);
            }
        
        double sum= hand + type;
        System.out.print("$");
        System.out.printf("%.2f",sum);
           System.out.println("");
    }
    }
}
