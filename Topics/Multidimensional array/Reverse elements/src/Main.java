

class ArrayOperations {
    public static void reverseElements(int[][] arr) {
        // write your code here
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length / 2; i++) {
                int temp = arr[j][i];
                arr[j][i] = arr[j][arr[j].length - i - 1];
                arr[j][arr[j].length - i - 1] = temp;
            }
        }
    }
}