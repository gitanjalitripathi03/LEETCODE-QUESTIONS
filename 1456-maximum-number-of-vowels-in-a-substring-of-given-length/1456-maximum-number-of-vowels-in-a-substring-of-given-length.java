class Solution {
    public int maxVowels(String s, int k) {
        

        int count = 0;
        // int max = 0;

        for(int i=0; i<k; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        int max = count;

        for(int i=k; i<s.length(); i++){

            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i-k);

            if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u'){
                count ++;
                //max = Math.max(max, count);
            }

            if(ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u') count --;

            max = Math.max(max, count);
        }
        return max;
    }
}