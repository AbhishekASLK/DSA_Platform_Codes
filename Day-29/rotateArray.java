class Solution {
    
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        if(k>=n){
            k=k%n;
        }
        int arr2[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            arr2[i]=arr[i];
        }
        
        for(int i=n-k;i<n;i++){
            arr[j++]=arr2[i];
        }

        for(int i=0;i<n-k;i++){
            arr[j++]=arr2[i];
        }
    }
}
