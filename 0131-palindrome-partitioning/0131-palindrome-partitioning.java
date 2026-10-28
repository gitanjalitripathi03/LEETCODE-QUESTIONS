class Solution {
    public List<List<String>> partition(String s) {

        List<String> ll = new ArrayList<>();
        List<List<String>> ans  = new ArrayList<>();
        partition(s, ll, ans);
        return ans;
    }

    public static void partition(String ques, List<String> ll, List<List<String>> ans){
        if(ques.length()==0){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int cut=1; cut<=ques.length(); cut++){
            String s = ques.substring(0, cut);
            if(isPalindrome(s)){
                ll.add(s);
                partition(ques.substring(cut), ll, ans);
                ll.remove(ll.size()-1);
            }   
        }
    }

    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}