class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int size=matrix.size();
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
                swap(matrix[i][j],matrix[j][i]);
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0,k=size-1;j<k;j++,k--)
            {
                swap(matrix[i][j],matrix[i][k]);
            }
        }
        
    }
};

