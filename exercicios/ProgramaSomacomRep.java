package exercicios;

import java.util.Scanner;

public class ProgramaSomacomRep {
    public static void main(String[] args) {
        int n, s = 0;
        String resp;
        try (Scanner input = new Scanner(System.in)) {
            do {
                System.out.print("Digite um número: ");
                n = input.nextInt();
                s += n;
                System.out.print("Deseja continuar? [S/N] ");
                resp = input.next();
            } while (resp.equals("S"));
        System.out.println("A soma de todos os valor é: " + s); 
        }
    }
}
