class Solution {
    public int minMoves(int[] nums) {

        int min = nums[0];
        for(int num : nums){
            min = Math.min(min, num);
        }

        int moves = 0;
        for(int num : nums){
            moves += num - min;
        }

        return moves;
    }


        //arrays.sort(nums);
    //     int count  = 0;
    //     return check(nums, count);
    // }



    // public int check(int []nums, int count){
    //     Arrays.sort(nums);
    //     if(equal(nums)) return count;
    //     else count++;
    //     for(int i=0; i<nums.length-1; i++){
    //         nums[i] += 1;
    //     }
        
    //     return check(nums, count);
    // }



    // public boolean equal(int []nums){
    //     for(int i=1; i<nums.length; i++){
    //         if(nums[i-1]!=nums[i]) return false;
    //     }
    //     return true;
    // }

}

