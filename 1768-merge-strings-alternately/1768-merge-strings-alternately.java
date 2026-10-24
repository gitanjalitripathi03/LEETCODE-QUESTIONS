class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String s = "";
        
        char []a = word1.toCharArray();
        char []b = word2.toCharArray();
        //char []ans = new char[word1.length()+word2.length()];
        int j = 0;

        while(j<a.length || j<b.length){
            if(j<a.length){
                s += a[j];
            }
            if(j<b.length){
                s += b[j];
            }
            j++;
        }

        // for(int i=0; i<ans.length; i=i+2){
        //     ans[i] = a[j];
        //     ans[i+1] = b[j];
        //     j++;
        // }
        // for(int n : ans){
        //     s += n;
        // }
        return s;
    }
}