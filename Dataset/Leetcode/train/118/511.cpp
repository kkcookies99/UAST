 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<int> cur(1, 1);
        vector<vector<int>> res;
        while(res.size() < numRows) {
            res.push_back(cur);
            vector<int> pre = cur;
            cur.clear();
            cur.push_back(1);
            for(int j = 0; j < pre.size() - 1; j++) cur.push_back(pre[j] + pre[j+1]);
            cur.push_back(1);
        }   
        return res;
    }
};

