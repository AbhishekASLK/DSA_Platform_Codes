class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int req = k - arr[i];

            if (hm.containsKey(req)) {
                count += hm.get(req);
            }

            // Update the count for the current array element in the map
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        return count;
    }
}
