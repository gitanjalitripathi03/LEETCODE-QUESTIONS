class Solution {
    public int firstUniqueEven(int[] nums) {
        int []freq = new int[101];
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }
   
        for(int i=0; i<nums.length; i++){
            if((nums[i]%2==0) && (freq[nums[i]]==1)) return nums[i];
        }
        return -1;
    }
}