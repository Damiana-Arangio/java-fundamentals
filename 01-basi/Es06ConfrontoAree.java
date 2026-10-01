/*
    Confronto aree
    1. Calcolare l’area di un quadrato e mostrarla a video.
    2. Calcolare l’area di un rettangolo e mostrarla a video.
    3. Confrontare l’area del quadrato con l’area del rettangolo e 
    indicare a video se l’area del quadrato è maggiore di quella del rettangolo.
*/

public class Es06ConfrontoAree {
    public static void main(String[] args) {

        // Inizializzazioni
        byte lato = 4;
        byte base = 10;
        byte altezza = 5;

        // Operazioni
        int areaQuadrato = lato * lato;
        int areaRettangolo = base * altezza;

        // Output
        System.out.println("Area quadrato: " + areaQuadrato);
        System.out.println("Area rettangolo: " + areaRettangolo);

        if(areaQuadrato > areaRettangolo) {
            System.out.println("L'area del quadrato è maggiore di quella del rettangolo!");
        }
        else {
            System.out.println("L'area del quadrato non è maggiore di quella del rettangolo!");
        }
    }
}
