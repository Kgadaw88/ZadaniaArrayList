import java.util.Scanner;

/**
 * Wprowadź n liczb całkowitych do jednowymiarowej tablicy i wyprowadź je na ekran w odwrotnej kolejności.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wielkość tablicy: ");

        int sizeArray = scanner.nextInt();
        int[] arrayList = new int[sizeArray];

        // entering elements into the array list
        System.out.printf("Podaj elementy tablicy: ");
        for (int i = 0; i < arrayList.length; i++){
            arrayList[i] = scanner.nextInt();
        }

        // loop reverse the order of array elements
        for (int i = arrayList.length; i > 0; i-- ){
            System.out.println(i);
        }
    }
}
