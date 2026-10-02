/*
    Tessera a punti

    Dato il valore dei punti sulla tessera del cliente,
    mostrare a video il messaggio appropriato:

    - 0 punti: "Ti consigliamo di sottoscrivere la tessera"
    - 10 punti: "Benvenuto, sei un nuovo cliente"
    - 11 o 14 punti: "Sei un cliente junior"
    - 15 o 40 punti: "Sei un cliente super fedele"
    - Qualsiasi altro punteggio: "Raccolta punti in corso"
*/

public class Es11TesseraPunti {
    public static void main(String[] args) {

        // Inizializzazione
        int punti = 11;

        // Controllo punti
        switch (punti) {
            case 0 -> System.out.println("Ti consigliamo di sottoscrivere la tessera");
            case 10 -> System.out.println("Benvenuto, sei un nuovo cliente");
            case 11, 14 -> System.out.println("Sei un cliente junior");
            case 15, 40 -> System.out.println("Sei un cliente super fedele");
            default -> System.out.println("Raccolta punti in corso");
        }
    }
}