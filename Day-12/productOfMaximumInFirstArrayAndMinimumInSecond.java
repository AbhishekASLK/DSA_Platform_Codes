class Solution{
    
    // Function for finding maximum and value pair
    public static long find_multiplication (int arr[], int brr[], int n, int m) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        // max element
        for(int i=0;i<n;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        
        // min element
        for(int i=0;i<m;i++){
            if(brr[i]<min)
                min = brr[i];
        }
        
        return min*max;
    }
    
    
}
