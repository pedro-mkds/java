package exercicios;

public class ProgremaRepeticao {
    public static void main(String[] args) {
        int cc = 1;
        while (cc <= 20) {
            if (cc % 2 != 0) { // se for ímpar
                cc++;
                continue;
            }
            System.out.println("Cambalhota " + cc);
            cc++;
        }
        System.out.println("Depois de tantas cambalhotas ele cansou e esse programa chegou ao seu fim!");
    }
}


