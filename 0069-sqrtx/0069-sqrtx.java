class Solution {
    public int mySqrt(int x) {
        
        if(x==0 || x==1){
            return x;
        }

        //using binary search

        int start = 1;
        int end = x;
        int ans = 0;
        while(start<=end){

            int mid = start+(end-start)/2;
            long square = (long)mid * mid;
            if(square == x){
                return mid;
            }else if(square<x){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
}