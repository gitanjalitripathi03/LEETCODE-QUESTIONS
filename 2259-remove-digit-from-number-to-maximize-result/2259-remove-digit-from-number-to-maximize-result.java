class Solution {
    public String removeDigit(String number, char digit) {
        
        String max = "";
        for(int i=0; i<number.length(); i++){
            if(number.charAt(i) == digit){
                StringBuilder sb = new StringBuilder(number);
                sb.deleteCharAt(i);
                String result = sb.toString();
                if(result.compareTo(max)>0) max = result;
            }
        }
        return max;
    }
}