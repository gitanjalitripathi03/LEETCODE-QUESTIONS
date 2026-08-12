class Solution {
    public int largestInteger(int n, int s) {

        if( s==0 )return 0;
        int t = n;
        String str = "";
        while(n>0){
            str += 9;
            n--;
        }
        int digit = Integer.parseInt(str);
        int limit = (int)Math.pow(10,t-1);

        while(digit>=limit){
            int num = digit;
            int sum = 0;
            while(num>0){
                int rem = num%10;
                sum += rem;
                num /=10;
            }
            if(sum==s) return digit;
            else digit--;
        }

        return -1;
    }
}