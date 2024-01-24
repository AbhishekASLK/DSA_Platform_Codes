

//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long[] result = new long[n];
	    
	    long zeroProduct = 1;
        int zero=0;
        
        for(int i=0;i<n;i++){
            if(nums[i]!=0)
                zeroProduct*=nums[i];
            else
                zero++;
        }
        
        long prod = 1;
        for(int i=0;i<n;i++){
            prod*=nums[i];
        }
        
        if(zero>=2)
            return result;
        
        for(int i=0;i<n;i++){
            if(nums[i]==0)
                result[i] = zeroProduct;
            else 
                result[i] = prod/nums[i];
        }
        
        return result;
	} 
} 
