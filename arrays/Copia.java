import java.util.Arrays;

public class Copia {
    public static void main(String[] args) {
        int[] original = {3, 6, 9, 12, 15};
        int[] copia = Arrays.copyOf(original, original.length);
        int[] parte = Arrays.copyOf(original, 3);
        for (int i : copia) {
            System.out.println(i);
        }
        System.out.println();
        for (int j : parte) {
            System.out.println(j);
        }

    }
}
