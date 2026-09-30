/*
    Esercizio 05 - Array giorni della settimana e nome completo
    1. Utilizzare un array per memorizzare e mostrare a video i giorni della settimana.
    2. Memorizzare il proprio nome e cognome in una stringa e mostrarli a video.
*/

public class Es05GiorniSettimanaNome {
    public static void main(String[] args) {

        // Inizializzazioni
        String giorniSettimana[] = {"Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato", "Domenica"};
        String mioNome = "Damiana Arangio";

        // Output
        System.out.println(giorniSettimana[0]);
        System.out.println(giorniSettimana[1]);
        System.out.println(giorniSettimana[2]);
        System.out.println(giorniSettimana[3]);
        System.out.println(giorniSettimana[4]);
        System.out.println(giorniSettimana[5]);
        System.out.println(giorniSettimana[6]);

        System.out.println(mioNome);
    }
}
