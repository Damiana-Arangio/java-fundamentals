/*
    Voti allievo - almeno 2
    - Un allievo ha 4 voti.
    - Quando almeno 2 voti sono maggiori o uguali a 6, visualizzare a video "L'allievo è promosso".
*/

public class Es10VotiAllievoAlmeno2 {
    public static void main(String[] args) {
        
        // Inizializzazioni
        byte voti[] = {7, 8, 3, 9};
        byte conta = 0;

        // Controllo voti
        for (byte i = 0; i < voti.length; i++) {

            if(voti[i] >= 6) {
                conta++;
            }

            if(conta == 2) {
                System.out.println("L'allievo è promosso");
                break;
            }
        }
    }
}