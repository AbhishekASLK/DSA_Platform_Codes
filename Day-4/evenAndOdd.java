class Solution {
    static void reArrange(int[] arr, int n) {
        int[] temp = new int[n];
        
        int index = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                temp[index] = arr[i];
                index+=2;
            }
        }
        
        index = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 1){
                temp[index] = arr[i];
                index+=2;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i] = temp[i];
        }
    }
};
