class Solution {
    public int smallestAbsent(int[] nums) {
        int sum = 0;

        for (int n : nums) {
            sum += n;
        }

        int candidate = 1;

        while (candidate * nums.length <= sum || contains(nums, candidate)) {
            candidate++;
        }

        return candidate;
    }

    

    private boolean contains(int[] nums, int target) {
        for (int n : nums) {
            if (n == target) {
                return true;
            }
        }
        return false;
    }


}