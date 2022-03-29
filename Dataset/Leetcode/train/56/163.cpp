 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        int st = -1, end = -1;   //负无穷，这里的start >= 0 ，我取-1就够了
        vector<vector<int>> ans;
        sort(intervals.begin(), intervals.end(), [](const vector<int>& lhs, const vector<int>& rhs) {
            return lhs[0] < rhs[0];
        });     
        for (const auto& interval: intervals) {
            if (end < interval[0]) {
                if (st != -1)   ans.push_back({st, end});
                st = interval[0], end = interval[1];
            } else end = max(end, interval[1]);
        }
        if (st != -1)   ans.push_back({st, end});
        return ans;
    } 
};

