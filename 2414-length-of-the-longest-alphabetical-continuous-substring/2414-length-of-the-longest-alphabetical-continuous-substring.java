class Solution {
    public int longestContinuousSubstring(String s) {
        
        int count = 1;
        int max = 1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i+1)-s.charAt(i)==1){
                count++;
                max = Math.max(max, count);
            }else{
                //max = Math.max(max, count);
                count = 1;
            }
        }
        return max;
    }
}