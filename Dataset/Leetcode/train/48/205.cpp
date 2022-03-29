class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int xLength=matrix.size();//几行
        int yLength=matrix[0].size();//几列
        for(int i=0;i<yLength;i++){
            vector<int>v;
            for(int j=xLength-1;j>=0;j--){
                v.push_back(matrix[j][i]);
            }
            
            matrix.push_back(v);
        }
        while(xLength--) auto iter = matrix.erase(matrix.begin());
    }
};

