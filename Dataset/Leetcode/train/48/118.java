class Solution {
    public void XXX(int[][] matrix) {
       int len = matrix.length,sub=0;
    	List<Integer> list = new ArrayList<Integer>();
    	for(int j=0;j<len;j++){
    		for(int i=len-1;i>=0;i--){
    			list.add(matrix[i][j]);
    		}
    	}
    	for(int i=0;i<len;i++){
    		for(int j=0;j<len;j++){
    			matrix[i][j] = list.get(sub);
    			sub++;
    		}
    	}	 
    }
}

