class Solution {
    public int dominantIndex(int[] nums) {
        
        
        int n = nums.length;

        int index = 0;
        int num = nums[0];
        for(int i=1; i<n; i++){
            if(nums[i]>num){
                index = i;
                num = nums[i];
            }
        }

        Arrays.sort(nums);
        if(nums[n-1] >= nums[n-2]*2) return index;
        return -1;
    }
}