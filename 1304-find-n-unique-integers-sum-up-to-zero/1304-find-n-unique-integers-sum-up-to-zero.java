class Solution {
    public int[] sumZero(int n) {
        int []ans = new int[n];

        if(n % 2 == 0){
            int num = n/2;
            int n1 = 1;
            int n2 = -1;
            for(int i=num; i<n; i++){
                ans[i] = n1;
                n1++;
            }
            for(int i=num-1; i>=0; i--){
                ans[i] = n2;
                n2--;
            }
        }else{
            int num1 = -1 * (n/2);
            for(int i=0; i<n; i++){
                ans[i] = num1;
                num1++;
            }
        }
        return ans;
    }
}