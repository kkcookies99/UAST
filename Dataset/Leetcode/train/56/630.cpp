 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(), intervals.end(), [](auto& v1, auto& v2) {
            return v1[0] < v2[0];
        });
        vector<vector<int>> res;
        int l = intervals[0][0], r = intervals[0][1];
        for (auto& v : intervals) {
            if (v[0] > r) {
                res.push_back({l, r});
                l = v[0], r = v[1];
            } else l = min(l, v[0]), r = max(r, v[1]);
        }
        res.push_back({l, r});
        return res;
    }
};

