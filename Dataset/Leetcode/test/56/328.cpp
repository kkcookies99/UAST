 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> ans;
        map<int, int> mmp;
        for(auto& x : intervals) ++mmp[x[0]], --mmp[x[1]];
        int sum = 0, begin = 0;
        bool flag = true;
        for(auto& [idx, cnt] : mmp) {
            if(flag) begin = idx, flag = false;
            sum += cnt;
            if(sum == 0) ans.push_back({begin, idx}), flag = true;
        }
        return ans;
    }
};

