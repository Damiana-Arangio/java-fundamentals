/*
    Esercizio 02 - Tipi di variabili
    Creare un programma Java che dichiari e inizializzi variabili utilizzando i principali tipi primitivi:
    char, byte, short, int, long, float, double e boolean.
    Stampare poi a video il valore di ciascuna variabile.
*/
public class Es02TipiVariabili {

    public static void main(String[] args) {

        // Inizializzazioni

        char carattere = 'D';
        
        byte numInteroPiccolo = 100;
        short numInteroMedio = 10000;
        int numIntero = 50000;
        long numInteroLungo = 4210000L;

        float numDecimale = 32.902456f;
        double numDecimalePreciso = 324.019938282;

        boolean valoreBooleano = true;

        // Output
        System.out.println("Carattere: " + carattere);
        System.out.println("Numero intero piccolo: " + numInteroPiccolo);
        System.out.println("Numero intero medio: " + numInteroMedio);
        System.out.println("Numero intero: " + numIntero);
        System.out.println("Numero intero lungo: " + numInteroLungo);
        System.out.println("Numero decimale: " + numDecimale);
        System.out.println("Numero decimale preciso: " + numDecimalePreciso);
        System.out.println("Valore booleano: " + valoreBooleano);
    }
}