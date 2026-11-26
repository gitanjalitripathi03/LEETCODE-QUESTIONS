class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int mindiff = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0; i<=n-k; i++){
            int diff = nums[i+k-1] - nums[i];
            mindiff = Math.min(mindiff, diff);
        }
        return mindiff;
    }
}