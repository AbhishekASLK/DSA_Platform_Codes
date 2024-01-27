class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                count++;
        }
        while(count>0){
            for(int i=0;i<n-1;i++){
                if(arr[i]==0){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            count--;
        }
    }
}
