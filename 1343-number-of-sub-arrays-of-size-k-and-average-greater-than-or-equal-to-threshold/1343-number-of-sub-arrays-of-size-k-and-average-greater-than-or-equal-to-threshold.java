class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int count = 0;
        int n = arr.length;;
        for(int i=0; i<=n-k; i++){

            int sum = 0;
            for(int j=i; j<i+k; j++){
                sum += arr[j];
            }

            int avg = sum / k;
            if(avg >= threshold) count++;
        }
        return count;
    }
}