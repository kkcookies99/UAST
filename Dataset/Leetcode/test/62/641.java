class Solution {
    public int XXX(int m, int n) {
        int[] graph = new int[n];
        Arrays.fill(graph,1);
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                graph[j] += graph[j-1];
            }
        }
        return graph[n-1];
    }
}

