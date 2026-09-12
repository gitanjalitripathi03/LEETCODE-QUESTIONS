class Solution {
    public int countSpecialIntegers(int[] nums) {


        int n = nums.length;
        int []freq = new int[101];
        for(int num : nums){
            freq[num]++;
        }

        int count = 0;
        for(int i=0; i<freq.length; i++){

            int []occur = new int[3];
            if(freq[i]==3){
                int k = 0;
                for(int j=0; j<nums.length; j++){
                    if(nums[j]==i){
                        occur[k] = j;
                        k++;
                    }
                }
                if(occur[1]-occur[0] == occur[2]-occur[1]){
                count++;
                }
            }
            // if(occur[1]-occur[0] == occur[2]-occur[1]){
            //     count++;
            // }

            
        }
        return count;
        
    }
}