class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<>();
        int minr = 0, maxr = matrix.length-1, minc = 0, maxc = matrix[0].length-1;
        int te = matrix.length * matrix[0].length;
        int c = 0;

        while(c < te){


            for(int i=minc; i<=maxc && c < te; i++){
                ans.add(matrix[minr][i]);
                c++;
            }
            minr++;


            for(int i=minr; i<=maxr && c < te; i++){
                ans.add(matrix[i][maxc]);
                c++;
            }
            maxc--;


            for(int i=maxc; i>=minc && c < te; i--){
                ans.add(matrix[maxr][i]);
                c++;
            }
            maxr--;


            for(int i=maxr; i>=minr && c < te; i--){
                ans.add(matrix[i][minc]);
                c++;
            }
            minc++;
        }

        return ans;

    }
}