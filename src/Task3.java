import java.util.*;

/**
 * W tablicy jednowymiarowej znajdź liczbę, która występuje najczęściej || tego nie umiem zrobić
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ile emelentów ma mieć tablica: ");
        int arraySize = scanner.nextInt();

        int[] arrayList = new int[arraySize];
        int[] results = new int[arraySize];
        System.out.print("Podaj elementy tablicy oddzielając je spacją: ");

        for (int i = 0; i < arrayList.length; i++){
            arrayList[i] = scanner.nextInt();
        }

        // sorting arrayList form the smallest to the largest
        Arrays.sort(arrayList);

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i: arrayList){
            Integer count = map.get(i);
            map.put(i, count == null ? 1 : count + 1);
            System.out.println(Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey());
        }

//

//        int[] results = new int[number];
//
//        for (int x: results){
//            System.out.print(x + ", ");
//        }

    }
}
