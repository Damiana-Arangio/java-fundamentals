/*
    Esercizio 03 - Array giorni dei mesi
    Creare un array di 12 elementi contenente il numero
    di giorni di ciascun mese dell'anno.
    Assegnare i valori alle varie posizioni dell'array
    e stampare a video il valore di una posizione.
*/

public class Es03ArrayGiorniMese {

    public static void main(String[] args) {

        // Dichiarazione
        byte giorniMese[] = new byte[12];

        // Inizializzazione
        giorniMese[0] = 31;
        giorniMese[1] = 28;
        giorniMese[2] = 31;
        giorniMese[3] = 30;
        giorniMese[4] = 31;
        giorniMese[5] = 30;
        giorniMese[6] = 31;
        giorniMese[7] = 31;
        giorniMese[8] = 30;
        giorniMese[9] = 31;
        giorniMese[10] = 30;
        giorniMese[11] = 31;

        // Output
        System.out.println("Giorni mese[0] = " + giorniMese[0]);

    }
}