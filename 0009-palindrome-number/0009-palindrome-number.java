class Solution {
    public boolean isPalindrome(int x) {
         int orgnum = x ;
        int revnum = 0 ;
        while( x>0 ){
            int lastdig = x % 10;
            revnum = revnum * 10 + lastdig;
            x /= 10 ;
        }
        if(orgnum == revnum){
            return true;
        }else{
            return false;
        }
    }
}