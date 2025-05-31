package exercicios;

public class ProgramaAtr {
    public static void main(String[] args) {
    int idade = 30;
    String valor = Integer.toString(idade);
    System.out.println(valor);

    String value = "30.5";
    float idad = Float.parseFloat(value);
    System.out.printf("%.3f", idad);
    }
    
}

