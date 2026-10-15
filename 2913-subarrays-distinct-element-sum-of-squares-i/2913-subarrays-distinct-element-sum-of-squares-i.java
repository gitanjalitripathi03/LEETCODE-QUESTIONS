class Solution {
    public int sumCounts(List<Integer> nums) {
        
        int n = nums.size();
        int sum = 0;

        for(int i=0; i<n; i++){
            int start = i;

            for(int j=i; j<n; j++){
                int end = j;
                Set<Integer> list = new HashSet<>();
                
                for(int k=start; k<=end; k++){
                    list.add(nums.get(k));
                }

                int count = list.size();
                sum += count*count;
            }
        }
        return sum;
    }
}