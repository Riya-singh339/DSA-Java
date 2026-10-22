import java.util.ArrayList;
import java.util.Collections;

public class Bucket {

    static void bucketSort(float[] arr) {
        int n = arr.length;

        ArrayList<Float>[] buckets = new ArrayList[n];

        // Create buckets
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }

        // Put elements into buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (arr[i] * n);

            // Keep index within valid bucket range
            if (bucketIndex >= n) {
                bucketIndex = n - 1;
            }

            buckets[bucketIndex].add(arr[i]);
        }

        // Sort each bucket
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // Copy sorted elements back to original array
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (float value : buckets[i]) {
                arr[index++] = value;
            }
        }
    }

    public static void main(String[] args) {
        float[] arr = {0.5f, 0.4f, 0.3f, 0.2f, 0.1f};

        bucketSort(arr);

        for (float value : arr) {
            System.out.print(value + " ");
        }
    }
}