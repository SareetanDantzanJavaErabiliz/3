



/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU
 */
public class DantzenIzenak {
    
    public static void main( String [] parametroak ) {
        
        char karak = 'a';
        
        System.out.print( "Letra bat eman eta letra hortaz hasten den dantza baten izena emango dizut:" );
              
        try {

            karak = (char) System.in.read( );
        }
        catch( Exception e ) {

            System.out.println( "Karakterea ez da egokia" );
            
        }
            
        switch( karak )
        {
		case 'a':
			System.out.println( "Axuri beltza \n" );
			break;
		case 'b':
			System.out.println( "Banako \n" );
			break;
		case 'e':
                System.out.println( "Eguzki-dantza \n" );
			break;
		default:
			System.out.println( "Sentitzen dut, baina ez naiz oroitzen \n" );
	}

    }
}
