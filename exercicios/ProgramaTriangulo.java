package exercicios;

import java.util.Scanner;

public class ProgramaTriangulo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Programa para identificar um triângulo!");
            System.out.print("Digite o valor do 1° lado: ");
            int v1 = input.nextInt();
            System.out.print("Digite o valor do 2° lado: ");
            int v2 = input.nextInt();
            System.out.print("Digite o valor do 3° lado: ");
            int v3 = input.nextInt();
            if ((v1 > v2 + v3) || (v2 > v1 + v3) || (v3 > v1 + v2)) {
                System.out.println("Estas medidas não podem formar um triângulo.");
            } else if (v1 == v2 && v2 == v3) {
                System.out.println("Essas medidas forma um triângulo EQUILATERO (todos os lados iguais)");
            } else if ((v1 == v2) || (v2 == v3) || (v3 == v1)) {
                System.out.println("Essas medidas forma um triângulo ISÓCELES (possoui dois lados com mesma medida)");
            } else if (v1 != v2 && v2 != v3) {
                System.out.println("Essas medidas forma um triângulo ESCALENO (possoui lados diferentes)");
            }
            
        }
        
    }
}
