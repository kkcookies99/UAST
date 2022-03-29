 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        if(numRows<=0) return {};
        if(numRows== 1) return { {1} };
        vector<vector<int>> res;
        for(int i=0;i<numRows;++i) {
            //当前层
            vector<int> t;
            for(int j=0;j<=i;++j) {
                if(j==0 || j==i) {
                    t.push_back(1);
                }else {
                    t.push_back( res[i-1][j-1] + res[i-1][j] );
                }
            }
            res.push_back(t);
        }
        return res;
        


    }
};

