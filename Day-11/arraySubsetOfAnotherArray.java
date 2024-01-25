class Compute {
    public String isSubset( long arr1[], long arr2[], long n, long m) {
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(arr2.length>arr1.length)
            return "No";
            
        for(int i=0;i<arr2.length;i++){
            boolean f = false;
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    arr1[i] = -1;
                    f = true;
                }
            }
            if(f==false)
                return "No";
        }
        
        return "Yes";
    }
}
