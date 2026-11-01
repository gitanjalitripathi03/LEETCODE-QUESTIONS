class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);

        
        int check = skill[0]+skill[skill.length-1];
        int k = 1, l = skill.length-2;
        while(k<l){
            if(skill[k]+skill[l] != check) return -1;
            k++;
            l--;
        }
        
        long sum = 0;
        int i = 0, j = skill.length-1;
        while(i<j){
            sum += skill[i]*skill[j];
            i++;
            j--;
        }
        return sum;
    }
}

