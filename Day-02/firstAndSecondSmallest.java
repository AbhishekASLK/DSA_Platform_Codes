

//User function Template for Java


class Compute 
{
    public long[] minAnd2ndMin(long arr[], long n)  
    {
        long small = Long.MAX_VALUE;
        long secondSmall = Long.MAX_VALUE;
        
        for(long x: arr){
            if(x<small){
                small = x;
            }
        }
        
        // for second min
        for(long x: arr){
            if(x>small && x<secondSmall){
                secondSmall = x;
            }
        }
        
        if(secondSmall != Long.MAX_VALUE){
            return new long[]{small,secondSmall};
        }
        
        return new long[]{-1,-1};
    }
}
