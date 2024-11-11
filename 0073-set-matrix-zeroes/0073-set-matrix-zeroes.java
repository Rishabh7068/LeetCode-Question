class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> x = new ArrayList<>(); 
        ArrayList<Integer> y = new ArrayList<>(); 

        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] == 0){
                    x.add(i);
                    y.add(j);
                }
            }
        }


        for(int i = 0 ; i < x.size() ; i++){
            int xp = x.get(i);
            int yp = y.get(i);
            //x++
            for(int k = xp ; k <matrix.length ; k++){
                matrix[k][yp] = 0;
            }
            //x--
            for(int k = xp ; k >= 0 ; k--){
                matrix[k][yp] = 0;
            }
            //y++
            for(int k = yp ; k >= 0 ; k--){
                matrix[xp][k] = 0;
            }
            //y--
            for(int k = yp ; k < matrix[0].length; k++){
                matrix[xp][k] = 0;
            } 
        }
        return;
    }
}