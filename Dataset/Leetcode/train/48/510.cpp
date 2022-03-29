 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n=matrix.size();
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]<0)
                    continue;
                int indexi=n-j-1,indexj=i;
                swap(matrix[i][j],matrix[indexi][indexj]);
                matrix[i][j]=-matrix[i][j];
                int ii=i,jj=j;
                while(matrix[indexi][indexj]>=0)
                {
                    int temp=ii;
                    ii=jj,jj=n-temp-1;
                    swap(matrix[ii][jj],matrix[indexi][indexj]);
                    matrix[ii][jj]=-matrix[ii][jj];
                }
            }
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                matrix[i][j]=-matrix[i][j];
    }
};

