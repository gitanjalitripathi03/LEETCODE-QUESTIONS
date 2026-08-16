class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        
        int mindiff = Integer.MAX_VALUE;
        int index = -1;
        for(int i=0; i<drones.length; i++){
            
            int diff = Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);

            if(diff<=drones[i][2]){
                if(diff<mindiff){
                    index = i;
                    mindiff = diff;
                }
            }
        }
        return index;
    }
}