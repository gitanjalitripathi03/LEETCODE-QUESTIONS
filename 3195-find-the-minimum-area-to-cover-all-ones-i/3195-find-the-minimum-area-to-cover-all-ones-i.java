class Solution {
    public int minimumArea(int[][] grid) {
        
       int minr = Integer.MAX_VALUE;
        int minc = Integer.MAX_VALUE;
        int maxr = Integer.MIN_VALUE;
        int maxc = Integer.MIN_VALUE;

        int cr = 0, er = grid.length-1, cc = 0, ec = grid[0].length-1;

        for(int i=cr; i<=er; i++){
            for(int j=cc; j<=ec; j++){

                if(grid[i][j] == 1){
                    minr = Math.min(minr, i);
                    minc = Math.min(minc, j);
                    maxr = Math.max(maxr, i);
                    maxc = Math.max(maxc, j);
                }
            }
        }
        int l = maxr - minr + 1;
        int b = maxc - minc + 1;
        return l*b;
    }
}