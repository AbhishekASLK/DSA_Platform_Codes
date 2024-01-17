class Solution
{
    static int majorityElement(int arr[], int size)
    {
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int x:arr){
            if(hashMap.containsKey(x)){
                hashMap.put(x,hashMap.get(x)+1);
            }
            else {
                hashMap.put(x,1);
            }
        }
        
        int max = Integer.MIN_VALUE;
        int ele = 0;
        for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                ele = entry.getKey();
            }
        }
        if(max>size/2){
            return ele;
        }
        return -1;
    }
}
