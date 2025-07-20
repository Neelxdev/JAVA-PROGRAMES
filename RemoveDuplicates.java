
    public class RemoveDuplicates {
        public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1; // Number of unique elements
    }
    public static void main(String[] args) {
        int[] nums = {1, 1,1,2, 2, 3};
        int uniqueCount = removeDuplicates(nums);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i] + " ");
        }
    }

   
}


