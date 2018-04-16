import java.util.Scanner;

/**
 * W tablicy jednowymiarowej przechowującą liczby całkowite znaleźć liczbę minimalną ciągu.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Podaj wielkość tablicy: ");
        int arraySize = scanner.nextInt();
        int[] arrayList = new int[arraySize];

        System.out.print("Podaj elemeny tablicy oddzielając dje spacją: ");
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = scanner.nextInt();
        }
        int result = arrayList[0];
        for (int i = 1; i < arraySize; i++){
            if (result > arrayList[i]){
                result = arrayList[i];
            }
        }
        System.out.println("Najmniejszy element tablicy to: " + result);
    }
}
