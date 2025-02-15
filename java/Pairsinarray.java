package Array;

public class Pairsinarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 3, 0};
        int sum = 3;
        pairsInArray(arr, sum);
    }

    static void pairsInArray(int[] arr, int sum) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pairs found with the given sum.");
        }
    }
}
