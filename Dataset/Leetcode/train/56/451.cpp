 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> res;
        int n = intervals.size();
        sort(intervals.begin(), intervals.end());
        for (int i = 0; i < n; i++) {
            if (res.empty() || res.back()[1] < intervals[i][0]) {
                res.emplace_back(intervals[i]);
            }else if (res.back()[1] < intervals[i][1]) {
                res.back()[1] = intervals[i][1];
            }
        }
        return res;
    }
};

