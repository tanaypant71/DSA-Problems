public class diffLargeSmall {
    int maxDifference(int[] arr, int n){
        int max_diff = arr[1] - arr[0];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[j] - arr[i] > max_diff){
                    max_diff = arr[j] - arr[i];
                }
            }
        }
        return max_diff;
    }
    public static void main(String[] args) {
        diffLargeSmall maxdif = new diffLargeSmall();
        int arr[] = {7, 9, 5, 6, 3, 2  };
        System.out.println("Maximum differnce is " + maxdif.maxDifference(arr, 5));
    }
}
