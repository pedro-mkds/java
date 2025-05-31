package exercicios;

import java.util.Scanner;

public class ProgramaScanner {

public static void main(String[] args) {
try (Scanner teclado = new Scanner(System.in)) {
    System.out.print("Digite seu nome: ");
    String nome = teclado.nextLine();
    
    System.out.print("Digite sua nota: ");
    float nota = teclado.nextFloat();
    
    System.out.println("A nota é " + nota + "\n");
    System.out.printf("A nota de %s é %.2f \n", nome, nota);
    System.out.format("A nota de %s é %.2f \n", nome, nota);
}

}

}