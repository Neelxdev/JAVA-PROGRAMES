import java.util.Arrays;

public class margingarray {
    public static void main(String[] args) {
    
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6, 10};
        int m = nums1.length;
        int n = nums2.length;
        
        int[] merged1= new int[m+n];

        //PROCESS 1
        for(int i = 0; i<m; i++) merged1[i] = nums1[i];
        for(int i = 0; i<n; i++) merged1[i+m] = nums2[i];
        Arrays.sort(merged1); // Sort the merged1 array

        
        System.out.print("merged1 Array: ");
        for (int num : merged1) {
            System.out.print(num + " ");
        }

        //PROCESS 2
        int[] merged2 = new int[m+n];
        System.arraycopy(nums1, 0, merged2, 0, m);
        System.arraycopy(nums2, 0, merged2, m, n);
        System.out.println("\n" +Arrays.toString(merged2));
    }
}