 class Solution {
    public List<List<Integer>> XXX(int numRows) {
            List<List<Integer>> a = new ArrayList<>();            
            int[][] c = new int[numRows][numRows];                    
             for(int i = 0 ; i <numRows; i++ ){   
                 List<Integer> b = new ArrayList<>();             
                 for(int j = 0 ; j <=i; j++ ){
                     if(j == 0 || i == j){
                         c[i][j] = 1;
                     }else{
                        c[i][j] = c[i-1][j-1] + c[i-1][j];
                     } 
                     b.add(c[i][j]);                               
            }
             a.add(b);
            }
            return a;
    }
}

