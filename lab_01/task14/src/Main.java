public class Main {
    public static void cycleSwap(int[] array) {
        int lastElement = array[array.length - 1];
        System.arraycopy(array, 0, array, 1, array.length - 1);
        array[0] = lastElement;
    }

    public static void cycleSwap(int[] array, int shift) {
        shift = shift % array.length; // щоб уникнути зсуву за межі масиву
        int[] temp = new int[shift];
        System.arraycopy(array, array.length - shift, temp, 0, shift);
        System.arraycopy(array, 0, array, shift, array.length - shift);
        System.arraycopy(temp, 0, array, 0, shift);
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 7, 4};
        cycleSwap(array);
        System.out.println(java.util.Arrays.toString(array)); // [4, 1, 3, 2, 7]

        int[] array2 = {1, 3, 2, 7, 4};
        cycleSwap(array2, 3);
        System.out.println(java.util.Arrays.toString(array2)); // [2, 7, 4, 1, 3]
    }
}