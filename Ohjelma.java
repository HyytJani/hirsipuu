
    
import java.util.Scanner;

public class Ohjelma {
    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.console().reader());
        

        Kayttoliittyma liittyma= new Kayttoliittyma( lukija);

        while(true){

            System.out.println("Pelataanko hirsipuuta? Paina enter tai jos haluat lopettaa paina e ja enter");
            String syote = lukija.nextLine().toLowerCase();

            
            if (syote.equals("e")) {                
                System.out.println("Hei hei!");
                break;
            }  
        liittyma.kaynnista();}
    }
}


