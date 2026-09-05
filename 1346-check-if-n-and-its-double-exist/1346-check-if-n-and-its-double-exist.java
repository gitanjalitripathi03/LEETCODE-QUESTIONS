class Solution {
    public boolean checkIfExist(int[] arr) {
        

        int n = arr.length;
        for(int i=0; i<n; i++){
            long num = arr[i]*2;

            for(int j=0; j<n; j++){
                if(num == arr[j] && i != j) return true;
            }
        }
        return false;
    }
}