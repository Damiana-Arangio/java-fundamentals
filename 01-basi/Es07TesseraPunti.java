/*
    Tessera a punti

    Dato il valore dei punti sulla tessera del cliente,
    mostrare a video il messaggio appropriato:

    - 0 punti: "Ti consigliamo di sottoscrivere la tessera"
    - 10 punti: "Benvenuto, sei un nuovo cliente"
    - Da 11 a 14 punti: "Sei un cliente junior"
    - Da 15 a 40 punti: "Sei un cliente super fedele"
    - Qualsiasi altro punteggio: "Raccolta punti in corso"
*/

public class Es07TesseraPunti {
    public static void main(String[] args) {

        // Inizializzazioni
        int punti = 10;

        // Output
        if (punti >= 10 && punti <= 40) {

            if (punti == 10) {
                System.out.println("Benvenuto, sei un nuovo cliente");                 
            }
            else if (punti <= 14) { // Intervallo 11-14
                System.out.println("Sei un cliente junior");                     
            }
            else { // Intervallo 15-40
                System.out.println("Sei un cliente super fedele");               
            }
        }
        else if (punti == 0) {
            System.out.println("Ti consigliamo di sottoscrivere la tessera");
        }
        else {
            System.out.println("Raccolta punti in corso");
        }
    }
}