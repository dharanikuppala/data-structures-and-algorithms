class Solution {
    public int[] runningSum(int[] nums) {
            int sum = 0;
            int i = 0;
            for(int num :nums ){
                sum+= num;
                nums[i++] = sum;
                } return nums;    
    }
}
