package esercizio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci valore di partenza del timer");
        int input = Integer.parseInt(scanner.nextLine());
        scanner.close();
        contoAllaRovescia(input);
    }

    public static void contoAllaRovescia(int num) {
        for (int i = num; i >= 0; i--) {
            System.out.println(i);
            
            //codice per introdurre la pausa di un secondo
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Timer interrotto" + e.getMessage());
            }
        }
    }
}
