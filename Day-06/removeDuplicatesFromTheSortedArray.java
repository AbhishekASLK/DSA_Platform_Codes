class Solution {
    public int removeDuplicates(int[] nums) {
        
        int[] result = new int[nums.length];

        int value = nums[0];
        result[0] = value;
        int index = 1;
        for(int i=1;i<nums.length;i++){
            if(value!=nums[i]){
                result[index++] = nums[i];
                value = nums[i];
            }
                
        }

        for(int i=0;i<nums.length;i++){
            nums[i] = result[i];
        }
        return index;
    }
}
