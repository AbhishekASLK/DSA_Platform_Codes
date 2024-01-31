class Solution {
    // This code gives TLE
    public int findKthLargest(int[] nums, int k) {
        int result = -1;
        for(int i=0;i<k;i++){
            int max = Integer.MIN_VALUE;
            int index = -1;
            for(int j=0;j<nums.length;j++){
                if(nums[j]>max){
                    max = nums[j];
                    index = j;
                }
            }
            nums[index] = Integer.MIN_VALUE;
            result = max;
        }
        return result;
    }
}
