public class twoSum {
    static int [] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Return the indices of the two numbers
                }
            }
        }
        return null; // Return empty array if no solution found
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 17;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
