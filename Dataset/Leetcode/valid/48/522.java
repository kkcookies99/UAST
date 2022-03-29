 class Solution {
    public void XXX(int[][] matrix) {
         int len1 = matrix.length;
         int len2 = matrix[0].length;
     
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int[] i:matrix){
            for(int j:i ){
                queue.offer(j);
            }
        }

        for(int n=0;n<len2;n++){
            for(int m=0;m<len1;m++){
                matrix[m][len1-1-n] = queue.poll();
            }
        }

    }
}

