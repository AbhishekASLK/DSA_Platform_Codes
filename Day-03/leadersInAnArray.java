class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<n-1;i++){
            boolean flag = true;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    flag = false;
                    break;
                }
                if(flag==false){
                    break;
                }
            }
            if(flag){
                result.add(arr[i]);
            }
        }
        result.add(arr[n-1]);
        return result;
    }
}
