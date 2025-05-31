package exercicios;

import java.util.Scanner;

public class ProgramaPernas {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        System.out.print("Quantas pernas tem: ");
        int pernas = input.nextInt();
        String tipo;
        tipo = switch (pernas) {
                case 1 -> "Saci";
                case 2 -> "Bípede";
                case 4 -> "Quadrúpede";
                case 6, 8 -> "Aranha";
                default -> "ET";
            };
        System.out.println(tipo);
        }
        
    }
}
