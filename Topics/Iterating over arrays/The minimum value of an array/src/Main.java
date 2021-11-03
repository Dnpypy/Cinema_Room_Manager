import java.util.*;

class Main {

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i = 0;

        while (i != n) {
            arr[i] = sc.nextInt();
            i++;
        }

        int[] mass2 = arr.clone();
        Arrays.sort(mass2);
        System.out.println(mass2[0]);
    }
}
