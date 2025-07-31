// ONLY APPLICABLE FOR SORTED ARRAY(ACCENDING ORDER)

import java.util.Scanner;

public class binarySearch {
    public static int search(int[] nums, int target){
        int low = 0, high = nums.length-1;
        while(low<=high){

            int mid = (low+high)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE SEARCHED VALUE -> ");
        int target = sc.nextInt();
        int result =  search(nums, target);
        if(result != -1){
            System.out.println("FOUND AT INDEX "+result);
        }else{
            System.out.println("NOT FOUND");
        }
    }
}   
