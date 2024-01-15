boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0; i<n; i++){
            int m = x-arr[i];
            if(hs.contains(m)){
                return true;
            }else{
                hs.add(arr[i]);
            }
        }
        
        return false;
}
