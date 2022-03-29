 class Solution {
    public void XXX(int[][] matrix) {
        int n=matrix.length;
        Queue<int[]> queue = new LinkedList<>();
        for (int i=0;i<n;i++){
            int[] temp = new int[matrix.length];
            for (int j=n-1;j>=0;j--){
                temp[n-1-j] = matrix[j][i];
            }
            queue.offer(temp);
        }
        for (int k=0;k<n;k++){
            matrix[k] = queue.poll();
        }
    }
}

