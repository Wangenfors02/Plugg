// Zacharias Andersson och Patric Wangenfors

import java.util.Random; //Import av Random atributet

public class RandomMultiplikationtabel {
    public static void main(String[] args) {
        int columns = 11;
        int maxRows = 15;
        Random random = new Random();
        int numRows = random.nextInt(maxRows) + 1; // Slumpmässigt number av rader mellan 1 och MaxRows

        // Skriver ut columnerna
        System.out.print("    "); // Extra rum för rad numrerna
        for (int i = 1; i <= columns; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.println("-----------------------------------------------");

        // Genererar multiplikations bordet med rad headers
        for (int i = 1; i <= numRows; i++) {
            System.out.printf("%2d |", i); // Skriver rad nummer och den skriver ut sträck symbolen
            for (int j = 1; j <= columns; j++) {
                // Kalkylerar produkten
                int product = i * j;
                
                // Visar produkten altså tabbelen
                System.out.printf("%4d", product);
            }
            System.out.println(); // Flytta nästa line till nästa row
            System.out.println();
        }
    }
}
