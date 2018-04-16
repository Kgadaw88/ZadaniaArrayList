import java.util.Scanner;

/**
 * Dla danej tablicy liczb całkowitych oblicz średnią arytmetyczną oraz sumę ciągu.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ile elementów ma zawierać tablica: ");
        int arraySize = scanner.nextInt();

        int[] arrayList = new int[arraySize];

        System.out.print("Podaj elementy tablicy, rozdzielając je spacją: ");
        for (int i = 0; i < arrayList.length; i++){
            arrayList[i] = scanner.nextInt();
        }

        // sumowanie elementów tablicy
        int sum = 0;
        for (int i = 0; i < arraySize; i++){
            sum += arrayList[i];
        }
        int avgArrayList = sum / arraySize;
        System.out.println("Srednia arytmetyczna ciągu to: " + avgArrayList + "\nSuma elementów tablicy wynosi: " + sum);
    }
}
