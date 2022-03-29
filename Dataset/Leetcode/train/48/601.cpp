 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int W=matrix[0].size();
        int H=matrix.size();
        for(int i=0;i<H-1;i++)
            for(int j=i+1;j<W;j++)
                swap(matrix[i][j],matrix[j][i]);
        for(int i=0;i<H;i++)
            for(int j=0;j<W/2;j++)
                swap(matrix[i][j],matrix[i][W-1-j]);
    }
};

