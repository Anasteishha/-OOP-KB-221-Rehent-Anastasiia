public class Main {
    public static boolean[] getSumCheckArray(int[] arr) {
        boolean[] result = new boolean[arr.length];
        if (arr.length < 2) {
            throw new IllegalArgumentException("Масив повинен містити принаймні 2 елементи");
        }
        result[0] = false;
        result[1] = false;
        for (int i = 2; i < arr.length; i++) {
            result[i] = arr[i] == arr[i - 1] + arr[i - 2];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 0, 4, 6, 10, 15, 25};
        boolean[] result = getSumCheckArray(arr);
        System.out.println(java.util.Arrays.toString(result)); // [false, false, true, false, false, true, false, true]
    }
}