class Solution {
    
    public pair indexes(long arr[], long x)
    {
        pair p = new pair(-1,-1);
        long start = -1;
        long end = -1;
        long count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x && count==0){
                start = i;
                count++;
            }
            if(arr[i]==x)
                end = i;
        }
        p.first = start;
        p.second = end;
        return p;
    }
}
