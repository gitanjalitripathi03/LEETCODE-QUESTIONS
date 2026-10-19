class Solution {
    public long[] sumOfThree(long num) {
        
        long []ans  = new long[3];

        long b = num/3;
        if(((b + b+1 + b-1) == num) ){
            ans[0] = b-1;
            ans[1] = b;
            ans[2] = b+1;
        }else{
            return new long[]{};
        }

        return ans;
    }
}