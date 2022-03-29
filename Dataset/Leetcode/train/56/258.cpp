 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if (intervals.empty()) return {};
        int len = intervals.size(), i;
        sort(intervals.begin(), intervals.end());
        vector<vector<int>> res;
        res.push_back(intervals[0]);
        for (i = 1; i < len; ++i)
        {
            if (res.back().back() < intervals[i][0])
                res.push_back(intervals[i]);
            else
            {
                res.back().back() = max(res.back().back(), intervals[i][1]);
            }
        }
        return res;
    }
};

