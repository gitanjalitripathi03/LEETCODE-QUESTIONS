class Solution {
    public int minimumArea(int[][] grid) {
        
        int minr = Integer.MAX_VALUE;
        int minc = Integer.MAX_VALUE;
        int maxr = Integer.MIN_VALUE;
        int maxc = Integer.MIN_VALUE;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){

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