class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
 // 3 sabse bade numbers ka product
 int product1 = nums[nums.length - 1]
 * nums[nums.length - 2]
 * nums[nums.length - 3];
 // 2 sabse chhote numbers (negative ho sakte hain) aur
 // aur sabse bada number ka product qki 2 neg milkr positive bana denge
 int product2 = nums[0] * nums[1] * nums[nums.length - 1];
 //dono me se maximum return karo
 return Math.max(product1, product2);
    }
}