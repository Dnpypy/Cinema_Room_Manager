import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        String[] b = sc.nextLine().split(" ");

        int[] box1 = new int[a.length];
        int[] box2 = new int[b.length];

        for (int i = 0; i < a.length; i++) {
            box1[i] = Integer.parseInt(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            box2[i] = Integer.parseInt(b[i]);
        }
        Arrays.sort(box1);
        Arrays.sort(box2);

        for (int i = 0; i < 1; i++) {
            if (box1[i] > box2[i] && box1[i + 1] > box2[i + 1] && box1[i + 2] > box2[i + 2]) {
                System.out.println("Box 1 > Box 2");
            } else if (box1[i] < box2[i] && box1[i + 1] < box2[i + 1] && box1[i + 2] < box2[i + 2]) {
                System.out.println("Box 1 < Box 2");
            } else {
                System.out.println("Incompatible");
            }
        }
    }
}