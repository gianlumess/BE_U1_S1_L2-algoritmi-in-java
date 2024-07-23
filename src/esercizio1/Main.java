package esercizio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creo l'oggetto scanner per chiedere input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi qualcosa");
        String stringaPerVerificareCaratteri = scanner.nextLine();
        System.out.println(stringaPariDispari(stringaPerVerificareCaratteri));
        
    }

    public static boolean stringaPariDispari(String stringa) {
        int stringLength = stringa.length();
        if (stringLength % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
