class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int []ans = new int[2*n];
        int i = 0;
        int j = 2*n-1;
        for(int k=0; k<n; k++){
            ans[i] = nums[k];
            ans[j] = nums[k];
            i++;
            j--;
        }
        return ans;
    }
}