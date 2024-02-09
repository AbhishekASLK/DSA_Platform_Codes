class Solution {
    public int findPairs(int[] nums, int k) {

        // 1. Removing the duplicates for unique pair
        HashSet<Integer> hs = new HashSet<>();
        for(int x:nums){
            hs.add(x);
        }

        // Copying the hashset to new array elements
        int[] arr = new int[hs.size()];
        int index = 0;
        for(int x:hs){
            arr[index]=x;
            index++;
        }

        int n = hs.size();

        // Finding the duplicates count element
        int duplicateCount = 0;
        for(int x:hs){
            int z=0;
            for(int i=0;i<nums.length;i++){
                if(x==nums[i])
                    z++;
            }
            if(z>1){
                duplicateCount++;
            }
        }
        // 2. For edge case k = 0, we are removing the duplicates
        if(k==0){
            return duplicateCount;
        }
            

        // 3. Finding the pair for k-diff
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int diff = arr[i]-arr[j];
                if(diff==k || diff==-k){
                    count++;
                }
            }
        }
        return count;
    }
}
