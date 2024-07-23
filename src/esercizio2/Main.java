package esercizio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero");
        int numero = Integer.parseInt(scanner.nextLine());

        numberToLetters(numero);
        scanner.close();
    }

    public static void numberToLetters(int number) {
        switch (number) {
            case 0: {
                System.out.println("ZERO");
                break;
            }
            case 1: {
                System.out.println("UNO");
                break;
            }
            case 2: {
                System.out.println("DUE");
                break;
            }
            case 3: {
                System.out.println("TRE");
                break;
            }
            default: {
                System.out.println("NON HAI INSERITO UN NUMERO COMPRESO TRA 0 E 3");
                break;
            }
        }
    }
}
