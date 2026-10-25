class Solution {
    public long maximizeSum(int[] nums, int k) {

        int n = nums.length;
        long sum = 0;
        long []gain = new long[n];

        for(int i=0; i<n; i++){
            sum += nums[i];

            char []arr = String.valueOf(nums[i]).toCharArray();
            Arrays.sort(arr);

            long maxnum = 0;
            for(int j=arr.length-1; j>=0; j--){
                maxnum = maxnum*10 + (arr[j]-'0');
            }
            gain[i] = maxnum - nums[i];
        }
        Arrays.sort(gain);

        for(int i=n-1; i>=n-k; i--){
            sum += gain[i];
        }
        return sum;
    }
}