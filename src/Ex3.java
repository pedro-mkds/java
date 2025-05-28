package Exercicios;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Ex3 {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();

        System.out.println("Resolução da tela: " + screenSize.width + " x " + screenSize.height);
    }

}
