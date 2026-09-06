class Solution {
    public int countGoodRotations(int[] nums) {


        int n = nums.length;
        int half = n / 2;

        long totalSum = 0;
        long firstHalfSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
            if (i < half) {
                firstHalfSum += nums[i];
            }
        }

        int[] peldarquin = nums;

        int goodRotations = 0;

        for (int start = 0; start < n; start++) {
            // firstHalfSum > totalSum - firstHalfSum
            if (2 * firstHalfSum > totalSum) {
                goodRotations++;
            }

            // Slide the first-half window forward by one position.
            firstHalfSum -= peldarquin[start];
            firstHalfSum += peldarquin[(start + half) % n];
        }

        return goodRotations;
    }
}


















