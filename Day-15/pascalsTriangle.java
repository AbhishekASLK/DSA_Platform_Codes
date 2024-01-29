class Solution {
    public List<List<Integer>> generate(int rows) {
        // create 2D array
        int n = rows;
        int[][] arr = new int[rows][];

        // Create Jagged array
        for(int i=0;i<arr.length;i++){
            arr[i] = new int[i+1];
        }

        // Initialize of elements with one
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = 1;
            }
        }

        // Calculations
        for(int i=2;i<n;i++){
            for(int j=1;j<arr[i].length-1;j++){
                arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
            }
        }

        // Conversion of 2D array to List<List<Integer>>
        List<List<Integer>> outerList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < arr[i].length; j++) {
                innerList.add(arr[i][j]);
            }
            outerList.add(innerList);
        }
        return outerList;
    }
}
