/*
    Voti allievo - tutti sufficienti
    -   Un allievo ha 4 voti.
    -   Quando tutti i voti sono maggiori o uguali a 6, visualizzare a video "L'allievo è promosso".
*/

public class Es08VotiAllievo {
    public static void main(String[] args) {

        byte voti[] = {2, 5, 6, 9};

        if(voti[0] >= 6 && voti[1] >= 6 && voti[2] >= 6 && voti[3] >= 6) {
            System.out.println("L'allievo è promosso");
        }
    }
}
