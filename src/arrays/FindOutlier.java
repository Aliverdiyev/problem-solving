package arrays;

public class FindOutlier {
    // Method - 1
    public static int find(int[] integers) {
        int numerOfOdds = 0;
        int numberOfEvens = 0;
        int integerOutlier;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                numberOfEvens++;
            } else {
                numerOfOdds++;
            }
        }
        if (numberOfEvens > numerOfOdds) {
            integerOutlier = 1;
        } else {
            integerOutlier = 0;
        }
        for (int i = 0; i < integers.length; i++) {
            if ((integers[i] % 2) == integerOutlier) {
                return integers[i];
            }
        }
        return 0;
    }

    // Method - 2
    public static int findOutlier(int[] integers) {
        int evenCount = 0;
        int oddCount = 0;
        for (int num : integers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        if (evenCount == 1) {
            for (int num : integers) {
                if (num % 2 == 0) {
                    return num;
                }
            }
        } else if (oddCount == 1) {
            for (int num : integers) {
                if (num % 2 == 1) {
                    return num;
                }
            }
        }
        // No outlier found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(find(arr));
        System.out.println(findOutlier(arr));
    }
}