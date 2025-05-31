package exercicios;

import java.util.Scanner;

public class ProgramaSoma {
    public static void main(String[] args) {
    try (Scanner teclado = new Scanner(System.in)) {
        System.out.print("Digite um valor: ");
        int v1 = teclado.nextInt();
        System.out.print("Digite outro valor: ");
        int v2 = teclado.nextInt();
        int soma = v1 + v2;
        System.out.printf("O resultado foi %d", soma);
    }
    }
}
