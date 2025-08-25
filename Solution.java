public class Solution {
    
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};  // no solution found
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,6};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println(result[0]+", "+result[1]);
    }
}


