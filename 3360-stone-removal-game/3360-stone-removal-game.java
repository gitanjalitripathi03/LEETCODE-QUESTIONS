class Solution {
    public boolean canAliceWin(int n) {

        // int counta = 0;
        // int countb = 0;
        // int k = 10;
        // // if(n <)
        // for(int i=0; i<n; i++){
        //     if(n-k>=0 && i%2==0){
        //         counta++;
        //     }else if(n-k>=0 && i%2!=0){
        //         countb++;
        //     }else{
        //         break;
        //     }
        //     k--;
        //     n -= k;
        // }
        // if(counta >= countb) return true;
        // return false;


        int k = 10;
        int count = 0;
        while(n-k>=0){
            n = n - k;
            count++;
            k--;
        }

        if(count % 2 != 0) return true;
        return false;
    }
}