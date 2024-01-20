class Solution
{
    public long findMinDiff (ArrayList<Integer> arr, int n, int m)
    {

        Collections.sort(arr);
        
        int[] result = new int[arr.size()];
        
        int index = 0;
        for(int x:arr){
            result[index++] = x;
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<=n-m;i++){
            int sum = result[i+m-1]-result[i];
            if(sum<min)
                min = sum;
        }
        return min;
    }
}
