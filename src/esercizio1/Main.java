package esercizio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creo l'oggetto scanner per chiedere input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi qualcosa");
        String stringaPerVerificareCaratteri = scanner.nextLine();
        System.out.println(stringaPariDispari(stringaPerVerificareCaratteri));

        System.out.println("inserisci un anno per verificare se è bisestile");
        int year = Integer.parseInt(scanner.nextLine());

        annoBisestile(year);
    }

    public static boolean stringaPariDispari(String stringa) {
        int stringLength = stringa.length();
        if (stringLength % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false; //perché l'anno non è divisibile per 400
                }
            } else {
                return true; //perché l'anno non è divisibile per 100 ma per 4
            }
        } else {
            return false; //perché l'anno non è divisibile per 4
        }
    }
}
