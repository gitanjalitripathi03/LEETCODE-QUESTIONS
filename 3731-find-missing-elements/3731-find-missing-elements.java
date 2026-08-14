class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[nums.length-1];
        int j = 0;
        for(int i=a; i<=b; i++){
            if(nums[j]==i && j<nums.length){
                j++;
            }else ans.add(i);
        }
        return ans;
    }
}