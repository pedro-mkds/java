package exercicios;

import java.util.Scanner;
import java.lang.Math;

public class ProgramaCalcDelta {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Calculadora de Delta");
            System.out.print("Digite o valor de A: ");
            double a = input.nextDouble();
            System.out.print("Digite o valor de B: ");
            double b = input.nextDouble();
            System.out.print("Digite o valor de C: ");
            double c = input.nextDouble();

            double delta = (b * b) - (4 * a * c);

            if (delta < 0) {
                System.out.println("Delta é negativo. Não há raízes reais.");
            } else {
                double raizDelta = Math.sqrt(delta);
                System.out.println("Delta = " + delta);
                System.out.println("Raiz de Delta = " + raizDelta);
            }
        }
    }
}
