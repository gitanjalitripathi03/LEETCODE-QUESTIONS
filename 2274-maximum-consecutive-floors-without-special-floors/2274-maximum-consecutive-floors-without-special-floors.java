class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        
        Arrays.sort(special);
        int n = special.length;
        int count = 0;

        if(Math.abs(bottom-special[0])>0) count = Math.max(count,special[0]-bottom);

        if(Math.abs(top-special[n-1])>0) count = Math.max(count,top-special[n-1]);
        for(int i=0; i<n-1; i++){
            if(Math.abs(special[i]-special[i+1])>1){
                count = Math.max(count, (special[i+1]-special[i]-1));
            }
        }
        return count;
    }
}