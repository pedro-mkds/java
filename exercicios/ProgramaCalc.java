package exercicios;

import java.util.Scanner;

public class ProgramaCalc {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Entrada do usuário
            System.out.print("Digite um número: ");
            double n = input.nextDouble(); // tipo: double

            // Cálculos
            double r2 = n % 2;            // Resto da divisão por 2
            double ec = Math.pow(n, 3);   // Elevação ao cubo
            double rq = Math.sqrt(n);     // Raiz quadrada
            double rc = Math.cbrt(n);     // Raiz cúbica
            double va = Math.abs(n);      // Valor absoluto 

            // Impressão dos resultados
            System.out.println("Número digitado: " + n);
            System.out.println("Resto da divisão por 2: " + r2);
            System.out.println("Elevado ao cubo: " + ec);
            System.out.println("Raiz quadrada: " + rq);
            System.out.println("Raiz cúbica: " + rc);
            System.out.println("Valor absoluto: " + va);
        }
    }
}
