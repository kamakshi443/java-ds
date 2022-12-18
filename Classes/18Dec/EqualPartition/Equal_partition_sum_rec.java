
public class Equal_partition_sum_rec {
    public static boolean isSubsetSum(int[] arr, int n, int sum) {
        if (sum == 0)
            return true;
        if (n == 0 && sum != 0)
            return false;
        // If last element is greater than sum, then ignore
        // it
        if (arr[n - 1] > sum)
            return isSubsetSum(arr, n - 1, sum);

        /*
         * else, check if sum can be obtained by any of
         * the following
         * (a) including the last element
         * (b) excluding the last element
         */
        return isSubsetSum(arr, n - 1, sum) || isSubsetSum(arr, n, sum - arr[n - 1]);
    }

    public static boolean findPartition(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        if (sum % 2 == 1) {
            return false;
        }
        return isSubsetSum(arr, n, sum / 2);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 9, 12 };
        int n = arr.length;
        if (findPartition(arr, n) == true) {
            System.out.println("Can divide");
        } else {
            System.out.println("Can't divide");

        }
    }
}
