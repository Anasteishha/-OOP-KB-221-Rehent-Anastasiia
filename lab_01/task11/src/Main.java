public class Main {
    public static int sum(int[] arr) {
        int sum = 0;
        if (arr == null || arr.length == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 6};
        System.out.println(sum(arr));
    }
}