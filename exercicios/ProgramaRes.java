package exercicios;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ProgramaRes {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();

        System.out.println("Resolução da tela: " + screenSize.width + " x " + screenSize.height);
    }

}
