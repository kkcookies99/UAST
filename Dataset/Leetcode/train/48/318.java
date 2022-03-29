class Solution {
    public void XXX(int[][] matrix) {
        //必须是深拷贝才行
        int[][] a = new int[matrix.length][matrix.length];;
        for(int i=0;i<a.length;i++)
	    {
	        for(int j=0;j<a[0].length;j++)
	        {
	            a[i][j]=matrix[i][j];        
	        }
	    }

        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                matrix[j][matrix.length-i-1] = a[i][j];//第i行——>第n-i-1列
            }
        }
        
    }
}
