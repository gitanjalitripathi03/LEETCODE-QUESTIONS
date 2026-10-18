class Solution {
    public int longestConsecutive(int[] nums) {
        
        Arrays.sort(nums);

        if(nums.length == 0) return 0;
        //else if(nums.length == 1) return 1;
        int max = 1;
        int count = 1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1]==nums[i]){
                continue;
            }else if(nums[i+1]-nums[i]==1){
                count++;
                max = Math.max(max, count);
            }else{
                max = Math.max(max, count);
                count = 1;
            }
        }
        return max;
    }
}