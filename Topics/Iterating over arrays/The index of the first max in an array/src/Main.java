import java.util.*;

class Main {

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = sc.nextInt();
        // put your code here
        int[] arr = new int[n];
        
        int max = 0;
        int i = 0;
        int s = 0;
        
        while (sc.hasNext()) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
                s = i;
            }
            i++;
        }  
        System.out.print(s);
    }
}
