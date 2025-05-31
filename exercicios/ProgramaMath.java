package exercicios;

public class ProgramaMath {
    public static void main(String[] args) {
        float v = 8.5f;
        System.out.print(v);
        System.out.println("Arredondamento para baixo: ");
        int ab = (int) Math.floor(v);
        System.out.print(ab);
        int ac = (int) Math.ceil(v);
        System.out.println("Arredondamento para cima: ");
        System.out.print(ac);
        int ac = (int) Math.ceil(v);
        System.out.println("Arredondamento para cima: ");
        System.out.print(ac);
        int an = (int) Math.ceil(v);
        System.out.println("Arredondamento normal: ");
        System.out.print(an);
    }
}
