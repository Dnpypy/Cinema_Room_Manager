import java.util.*;

class Main {

    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        boolean flag = true; // < = true
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {
                String str1 = a[i];
                String str2 = a[i + 1];
                if (str1.compareTo(str2) > 0) {
                    flag = false;
                    break;
                }
            }
        }
        System.out.print(flag);
    }
}