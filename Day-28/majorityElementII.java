class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i])
                    count++;
            }
            if(count>nums.length/3)
                result.add(nums[i]);
        }
        HashSet<Integer> hs = new HashSet<>(result);
        return new ArrayList<>(hs);
    }
}
