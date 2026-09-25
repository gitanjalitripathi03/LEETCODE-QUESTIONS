class Solution {
    public int maxSubArray(int[] nums) {
         // currentSum = abhi tak ka running sum
        // maxSum = ab tak mila sabse bada sum
        int currentSum = nums[0];
        int maxSum = nums[0];

        // second element se loop start karte hain
        for (int i = 1; i < nums.length; i++) {

        
            //  Naya subarray yahin se start karo (nums[i])
            //  Ya previous sum me current element jod do
            
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Agar currentSum bada hai maxSum se,
            // to maxSum update kar do
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}