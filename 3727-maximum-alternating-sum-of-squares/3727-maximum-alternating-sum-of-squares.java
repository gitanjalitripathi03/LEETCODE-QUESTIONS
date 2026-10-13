class Solution {
    public long maxAlternatingSum(int[] nums) {
        
        for(int i=0; i<nums.length; i++){
            nums[i] = Math.abs(nums[i]);
        }

        Arrays.sort(nums);

        int[] arr = new int[nums.length];
        int j = 0;
        int k = nums.length-1;

        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                arr[i] = nums[k];
                k--;
            }else{
                arr[i] = nums[j];
                j++;
            }
            // arr[i] = nums[k];
            // arr[i+1] = nums[j];
            // k--;
            // j++;
        }

        long ans = 0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0) ans += arr[i]*arr[i];
            else ans -= arr[i]*arr[i];
        }

        return ans;
    }
}