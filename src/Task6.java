import java.util.Arrays;
import java.util.Scanner;

/**
 * https://main.edu.pl/en/user.phtml?op=showtask&task=scz&con=PAS
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ile elementów ma zawierać tablica: ");
        int arraySize = scanner.nextInt();

        int[] arrayList = new int[arraySize];
        int[] arrayListSecondB = new int[arraySize];

        System.out.print("Podaj elementy tablicy, rozdzielając je spacją: ");
        for (int i = 0; i < arrayList.length; i++){
            arrayList[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arraySize; i++){
            sum += arrayList[i];
            arrayListSecondB[i] = sum;

//            Arrays.fill(arrayListSecondB, sum);
        }
        for (int x: arrayListSecondB){
            System.out.println(x);
        }
    }
}
