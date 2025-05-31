package exercicios;

import java.util.Scanner;

public class ProgramaFatorial {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Programa que calcula o fatorial de um número.");
            System.out.print("Digite um número: ");
            int valor = input.nextInt(); // pega o valor

            int fatorial = 1; // inicializa como 1 (neutro da multiplicação)
            int c = valor; // contador decrescente

            while (c > 1) {
                System.out.print(c + " X ");
                fatorial *= c;
                c--;
            }

            System.out.printf("1 = %d%n", fatorial);
        }
    }
}
