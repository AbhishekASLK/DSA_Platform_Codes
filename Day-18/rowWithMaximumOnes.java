class Solution {
    public int[] rowAndMaximumOnes(int[][] arr) {
        int row = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int ones = 0;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1){
                    ones++;
                }
            }
            if(ones>max){
                max = ones;
                row = i;
            }
        }
        return new int[]{row,max};
    }
}
