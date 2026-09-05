class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        int n = nums.length;


        int []maxarr = new int[n];

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(max, nums[i]);
            maxarr[i] = max;
        }

        int []minarr = new int[n];

        int min = Integer.MAX_VALUE;
        for(int i=n-1; i>=0; i--){
            min = Math.min(min, nums[i]);
            minarr[i] = min;
        }

        for(int i=0; i<n; i++){
            int score = maxarr[i] - minarr[i];
            if(score <= k) return i;
        }



        // for(int i=0; i<n; i++){

        //     for(int j=0; j<=i; j++){
        //         max = Math.max(max, nums[j]);
        //     }

        //     int min = Integer.MAX_VALUE;
        //     for(int j=i; j<n; j++){
        //         min = Math.min(min, nums[j]);
        //     }

        //     int score = max - min;
        //     if(score <= k) return i;
        // }


        return -1;
    }
}