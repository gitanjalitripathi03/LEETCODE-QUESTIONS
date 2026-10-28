class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        comb(candidates, target, ll, 0, list);
        return list;
    } 

    public static void comb(int[] candidates, int amount, List<Integer> ll, int idx, List<List<Integer>> list){
        if(amount == 0){
            //System.out.print(ll);
            //List<Integer> l = new ArrayList<>(ll);
            list.add(new ArrayList<>(ll));
            return;
        }

        for(int i=idx; i<candidates.length; i++){
            if(amount>=candidates[i]){
                ll.add(candidates[i]);
                comb(candidates, amount-candidates[i], ll, i, list);
                ll.remove(ll.size()-1);
            }
        }
    }
}