package exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class ProgramaVoto {
public static void main(String[] args) {
try (Scanner input = new Scanner(System.in)) {
    int anoAtual = LocalDate.now().getYear();
    System.out.println("Ano atual: " + anoAtual);
    System.out.print("Digite sua o ano em que você nasceu: ");
    int anonasc = input.nextInt();
    int i = anoAtual - anonasc;
    System.out.printf("Você possui %d anos e sua situação é:", i);
    if (i<16) {
        System.out.println("Não Vota!");
    } else {
        System.out.print("\nVoto é: ");
        if ((i>16 && i<18) || (i>70)) {
            System.out.print("Opcional");
        } else {
            System.out.print("Obrigatório");
        }
    }
}

}

}
