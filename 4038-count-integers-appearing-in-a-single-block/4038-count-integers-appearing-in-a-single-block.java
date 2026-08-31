class Solution {
    public int countSpecialIntegers(int[] nums) {

         Set<Integer> seen = new HashSet<>();
        Set<Integer> invalid = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // New block starts
            if (i == 0 || nums[i] != nums[i - 1]) {
                if (seen.contains(nums[i])) {
                    invalid.add(nums[i]); // appeared in an earlier block
                }
                seen.add(nums[i]);
            }
        }

        return seen.size() - invalid.size();
    }
}