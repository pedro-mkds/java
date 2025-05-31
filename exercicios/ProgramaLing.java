package exercicios;

import java.util.Locale;

public class ProgramaLing {
    public static void main(String[] args) {
        String linguagemSistema = Locale.getDefault().getLanguage();
        System.out.println("Linguagem do sistema operacional: " + linguagemSistema);

        String pais = Locale.getDefault().getCountry();
        System.out.println("País: " + pais);
    }
    
}
