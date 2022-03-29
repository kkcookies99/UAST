 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int bound=matrix.size()-1;
        for(int i=0;i<=matrix.size()/2;++i)
        {
            for(int j=i;j<bound-i;++j)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[bound-j][i];
                matrix[bound-j][i]=matrix[bound-i][bound-j];
                matrix[bound-i][bound-j]=matrix[j][bound-i];
                matrix[j][bound-i]=temp;
            }
        }
        return;
    }
};

