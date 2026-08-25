class Solution {
    public int missingMultiple(int[] nums, int k) {

        Arrays.sort(nums);
         int count=0;
       for (int num: nums){
        if(num%k == 0){
            count++;
        }
       }
      
        int n= nums.length;
         int[] ans =  new int[n];
         int index=0;
        for(int i=0; i<n;i++){
            if(nums[i] % k==0){
                ans[index]= nums[i];
                index++;
                
           
            }
        }
   int o =k;
   int j=1;
     for(int i=0;i<=count-1;i++){
        if(ans[i]==o){
            o= o+k;
            j++;      
        }else if(ans[i]>o){
            return o;
        }
        }
 return o;
        
}
}