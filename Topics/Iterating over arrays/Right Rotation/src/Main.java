import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String[] a = sc.nextLine().split(" ");
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            arr.add(Integer.parseInt(a[i]));
        }

        int rotation = sc.nextInt();
        rotation = rotation % arr.size();
        Collections.rotate(arr, rotation);

        for (Integer j: arr) {
            System.out.print(j + " ");
        }
    }
}