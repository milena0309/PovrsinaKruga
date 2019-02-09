
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Milena
 */
public class PovrsinaKruga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
// deklaracija promenljivih
        double r;
        double p;
        final double pi = 3.1415;
        
        Scanner tastatura = new Scanner(System.in);
        
        // dodela vrednosti promenljivim
        System.out.print("Unesite poluprecnik: ");
            r = tastatura.nextDouble();
       
            p = r * r * pi;

        // prikazivanje rezultata
        System.out.println("p = " + p);
        


        
        
        
        
        
        
        
        

    }

}
