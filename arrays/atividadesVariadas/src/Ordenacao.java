import java.util.Arrays;
public class Ordenacao {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 8, 1, 9};
        for (int numero : numeros) {
            System.out.println(numero);
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.binarySearch(numeros, 8)); 

    }
}
