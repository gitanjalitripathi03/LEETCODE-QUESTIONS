class Solution {
    static String[] key = {
            "",     "",     "abc", "def",
            "ghi",  "jkl",  "mno",
            "pqrs", "tuv",  "wxyz"
        };
        
        
        
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        keyPad(digits, "", list);
        
        return list;
    }
    
    public void keyPad(String digits, String ans, List<String> list) {
        
        if(digits.length()==0){
                list.add(ans);
                return;
        }
        
        char ch = digits.charAt(0);
        String s = key[ch-'0'];
        for(int i=0;i<s.length();i++){
            keyPad(digits.substring(1), ans+s.charAt(i), list);
        }
    }
}