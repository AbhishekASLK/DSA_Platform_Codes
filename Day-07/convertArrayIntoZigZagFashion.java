class Solution{
    
    public static void swap(int[] arr, int i){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;   
    }
    
    public void zigZag(int arr[], int n){
        for(int i=0;i<n-1;i++){
            if(i%2==0 && arr[i]>arr[i+1]){
                swap(arr,i);
                
            }
            if(i%2==1 && arr[i]<arr[i+1]){
                swap(arr,i);
            }
        }
    }
}
