

import java.util.Scanner;


public class Kayttoliittyma {
    Hirsipuu kirjaimet=new Hirsipuu();
    private Scanner lukija;
    Tiedostonluku sanat=new Tiedostonluku();  

    public Kayttoliittyma(Scanner lukija) {
        this.lukija = lukija;  
        lukija=new Scanner(System.console().reader()) ;       
    }    
    public void kaynnista () {
        String sana = sanat.haeSana();        
              
        
        while(true) {   
            if(kirjaimet.loppu)  {
               kirjaimet.nollaa();
                break;
            }      
            System.out.println("Arvaa kirjain! ( ! - lopettaa pelin)");
            String kirjain = lukija.nextLine().toLowerCase();

            
            if (kirjain.equals("!")) {                
                System.out.println("Hei hei!");
                break;
            }   

            kirjaimet.tarkastaTulosta(sana,kirjain);       

        
        }
    }
}

