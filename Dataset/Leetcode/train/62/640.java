class Solution {
    public int XXX(int m, int n) {
        int[][] graph = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0||j==0)
                    graph[i][j] = 1;
                else
                    graph[i][j] = graph[i-1][j] + graph[i][j-1];
            }
        }
        return graph[m-1][n-1];
    }
}

