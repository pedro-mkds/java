package exercicios;

import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        System.out.print("Em que ano você nasceu? ");
        int nasc = input.nextInt();
        int idade = 2025-nasc;
        System.out.println("Sua idade é: " + idade);
        if (idade>=18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }
    }


    }
    
}
