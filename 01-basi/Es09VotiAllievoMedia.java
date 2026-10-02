/*
    Voti allievo - media
    - Un allievo ha 4 voti.
    - Quando la media dei voti è superiore o uguale a 8, visualizzare a video "L'allievo è promosso".
*/

public class Es09VotiAllievoMedia {
    public static void main(String[] args) {
        
        // Inizializzazioni
        byte voti[] = {1, 4, 2, 8};

        // Operazioni
        double media = (voti[0] + voti[1] + voti[2] + voti[3])/(double) voti.length;

        // Output
        if(media >= 8) {
            System.out.println("L'allievo è promosso");
        }
    }
}
