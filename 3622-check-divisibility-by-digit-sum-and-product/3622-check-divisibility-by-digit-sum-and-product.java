class Solution {
    public boolean checkDivisibility(int n) {
        
        int num = n;
        int sum = 0;
        int prod = 1;
        while(num>0){
            int rem = num%10;
            sum += rem;
            prod *= rem;
            num /= 10;
        }

        if(n%(sum+prod)==0) return true;
        return false;
    }
}