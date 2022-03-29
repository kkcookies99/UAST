 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res;
        if(numRows == 0)
            return res;
        vector<int> a = {1};
        res.push_back(a);
        if(numRows == 1)
            return res;
        vector<int> b = {1,1};
        res.push_back(b);
        for(int i = 2;i<numRows;i++){
            vector<int> tmp = res[res.size()-1];
            vector<int> r = {1};
            for(int j = 0;j<tmp.size()-1;j++){
                r.push_back(tmp[j]+tmp[j+1]);
            }
            r.push_back(1);
            res.push_back(r);
        }
        return res;
    }
};

