class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        List<Integer> l = new ArrayList<>();
        int i = num.length-1;
        while( i>=0 || k>0){
            if(i>=0)
            k += num[i];
            l.add(k%10);
            k /= 10;
            i--;
        }
        Collections.reverse(l);
        return l;
    }
}