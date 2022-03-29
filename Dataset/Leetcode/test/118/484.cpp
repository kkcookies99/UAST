 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> yh(numRows,vector<int> (numRows,1));
        if(numRows>2){
            for(int i=2;i<numRows;i++){
                for(int j=1;j<i;j++){
                    yh[i][j]=yh[i-1][j-1]+yh[i-1][j];
                }
            }
        }
        for(int i=0;i<numRows;i++){
            yh[i].resize(i+1);
        }
        return yh;
    }
};

