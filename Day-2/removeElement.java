class Solution {
    public int removeElement(int[] nums, int val) {
        // counting how many val are there
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                count++;
            }
        }

        // temp array to ignore val
        int[] temp = new int[nums.length-count];
        int index = 0;
        int x = 0;
        for(int i=0;i<nums.length;i++){
            if(x==temp.length){
                break;
            }
            if(nums[i]!=val){
                x++;
                temp[index++] = nums[i];
            }
        }

        // copy that array
        for(int i=0;i<temp.length;i++){
            nums[i] = temp[i];
        }
        return nums.length-count;
    }
}
