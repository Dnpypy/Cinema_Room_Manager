import java.util.*;

class Main {
    
    public static Scanner sc = new Scanner(System.in);
    public static int n;
    public static int sum = 0;
    public static int[] arrN;
    
    public static void main(String[] args) {
        // put your code here
        n = sc.nextInt();
        arrN = new int[n];
        
        for (int i = 0; i < n; i++) {
            arrN[i] = sc.nextInt();
            sum += arrN[i];
        }
        System.out.print(sum);
    }
}
