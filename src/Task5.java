import java.util.Scanner;

/**
 * Dla tablicy liczb całkowitych znajdź jednocześnie minimum i maksimum tablicy.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ile elementów ma zawierać tablica: ");
        int arraySize = scanner.nextInt();

        int[] arrayList = new int[arraySize];

        System.out.print("Podaj elementy tablicy, rozdzielając je spacją: ");
        for (int i = 0; i < arrayList.length; i++){
            arrayList[i] = scanner.nextInt();
        }

        // szukanie minimum i maksimum w tablicy

        int minArray = arrayList[0];
        int maxArray = arrayList[0];
        for (int i = 0; i < arraySize; i++){
            if (minArray > arrayList[i]){
                minArray = arrayList[i];
            }
            if (maxArray < arrayList[i]){
                maxArray = arrayList[i];
            }
        }
        System.out.println("Wartość minimalna dla tej tablicy to: " + minArray +
                           "\nWartość maksymalna dla tej tablicy to: " + maxArray);
    }
}
