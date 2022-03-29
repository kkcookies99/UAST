 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(), intervals.end(), [&](const auto& u, const auto& v) {
            if (u[0] != v[0]) {
                return u[0] < v[0];
            }
            return u[1] > v[1];
        });

        vector<vector<int>> ret;
        int start = intervals[0][0], end = intervals[0][1];
        for (auto& itv : intervals) {
            if (end >= itv[0]) {
                end = max(end, itv[1]);
            } else {
                ret.push_back({start, end});
                start = itv[0];
                end = itv[1];
            }
        }
        ret.push_back({start, end});

        return ret;
    }
};

