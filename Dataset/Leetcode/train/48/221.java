class Solution {
    public void XXX(int[][] matrix) {
        Queue<Integer> queue = new LinkedList();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                queue.add(matrix[i][j]);
            }
        }

        for(int j=matrix.length-1;j>=0;j--){
            for(int i=0;i<matrix.length;i++){
                matrix[i][j] = queue.poll();
            }
        }
        return;
    }
}


