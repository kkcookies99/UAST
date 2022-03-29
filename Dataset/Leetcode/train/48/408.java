 class Solution {
    public void XXX(int[][] matrix) {
        int n=matrix.length;
        List list=new ArrayList();
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                list.add(matrix[j][i]);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=(int)list.get(0);
                list.remove(0);
            }
        }
    }
}

