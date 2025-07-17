import java.util.Arrays;

public class margingarray {
    public static void main(String[] args) {
    
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        int m = nums1.length;
        int n = nums2.length;
        
        int[] merged = new int[m+n];
        for(int i = 0; i<m; i++) merged[i] = nums1[i];
        for(int i = 0; i<n; i++) merged[i+m] = nums2[i];
        Arrays.sort(merged); // Sort the merged array

        
        System.out.print("Merged Array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}