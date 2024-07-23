package esercizio3;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // qui il programma si avvia chiamando il metodo che gestisce l'input dell'utente
        splitString();
    }

    public static void splitString() {
        // Creo l'oggetto Scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);
        String input;

        // Ciclo infinito per continuare a chiedere stringhe all'utente
        while (true) {
            System.out.println("Inserisci una stringa (inserisci ':q' per uscire):");
            input = scanner.nextLine();

            //questa è l'unica condizione affinché si esca dal loop infinito
            if (Objects.equals(input, ":q")) {
                break;
            }

            // Utilizzo la classe StringBuilder per costruire la stringa di output in modo efficiente
            //quindi qui creo un nuovo oggetto StringBuilder chiamato "risultato", inizialmente vuoto
            StringBuilder risultato = new StringBuilder();

            //ciclo ogni carattere della stringa
            for (int i = 0; i < input.length(); i++) {
                //aggiungo il carattere corrente al risultato
                risultato.append(input.charAt(i));

                //aggiungo una virgola dopo ogni carattere eccetto l'ultimo
                if (i < input.length() - 1) {
                    risultato.append(",");
                }
            }
            // converto il contenuto dello StringBuilder in una stringa che può essere stampata.
            System.out.println(risultato.toString());
        }
        scanner.close();
    }
}
