


/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte
 */
import java.util.Scanner;

public class AdinNagusikoa {
    
    public static void main ( String [] parametroak) {
    
        int adina = 0;
        final int ADINNAGUSITASUNA = 18;
        
        // Scanner klaseko Irakur objketua sortzen dugu
        Scanner irakur = new Scanner( System.in );
        System.out.print( "Mesedez, zure adina sartu: " );
        
        try {

            // Metodo honek zenbakia irakurtzen du
            adina = irakur.nextInt ( );        
        }
        catch( Exception e ) {

            // Adin egokia ez bada zero esleitzen diogu
            adina = 0;
        }

        // Scannerra itxi
        irakur.close( );
        
        // Adin nagusikoa den ala ez egiaztatzen dugu if else egitura erabiliz
              
        if ( adina == 0 ) {
            System.out.println( "\nErabiltzaileak sartutako adina ez da egokia" );
        }
        else {
            
            if ( adina >= ADINNAGUSITASUNA ) {
                System.out.println (+adina+ " urte dituzu. Adin nagusikoa zara");
            }
            else {
                System.out.println (+adina+ " urte dituzu. Oraindik ez zara adin nagusikoa");
                        
            }
        }

    }
    
}
