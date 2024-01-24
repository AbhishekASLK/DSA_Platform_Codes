class Solution {
    public String longestCommonPrefix(String[] strs) {

        // find the smallest string
        int min = Integer.MAX_VALUE;
        String small = "";
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min){
                min = strs[i].length();
                small = strs[i];
            }
        }

        int n = small.length();
        
        int count = 0;
        int result = Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            int temp = 0;
            for(int j=0;j<n;j++){
                if(strs[i].charAt(j)!=small.charAt(j)){
                    break;
                }
                else {
                    temp++;
                }
            }
            count = temp;
            if(count<result)
                result=count;
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<result;i++){
            sb.append(small.charAt(i));
        }
        if(sb.length()==0)
            return "";
        return sb.toString();
    }
}
