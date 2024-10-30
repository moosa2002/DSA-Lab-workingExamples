public class SearchInUnsortedArray {

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 4, 2};
        int target = 4;

        int result = linearSearch(array, target);
        if (result != -1) {
            System.out.println("number found at index: " + result);
        } else {
            System.out.println("number not found in the array.");
        }
    }
}
