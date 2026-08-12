class Solution {
    public int findKthPositive(int[] arr, int k) {

        int[] freq = new int[2001];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }

        int count = 0;
        for(int i=1; i<freq.length; i++){
            if(freq[i]==0){
                count++;
            }
            if(count==k){
                return i;
            }
        }
        return -1;
    }
}