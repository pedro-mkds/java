package exercicios;

import java.util.Locale;

public class Ex2 {
    public static void main(String[] args) {
        String linguagemSistema = Locale.getDefault().getLanguage();
        System.out.println("Linguagem do sistema operacional: " + linguagemSistema);

        String pais = Locale.getDefault().getCountry();
        System.out.println("País: " + pais);
    }
    
}
