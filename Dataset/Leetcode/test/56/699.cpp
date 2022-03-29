 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals)
    {
        if(intervals.size()<2)return intervals;
        vector<vector<int>> ret;
        sort(intervals.begin(), intervals.end(), [](const vector<int>& a, const vector<int>& b) { return a[0] < b[0]; });

        for (auto i = 1; i < intervals.size(); ++i) {
            if (intervals[i][0] > intervals[i - 1][1]) {
                ret.push_back(intervals[i - 1]);
            } else {
                intervals[i][0] = min(intervals[i - 1][0], intervals[i][0]);
                intervals[i][1] = max(intervals[i][1], intervals[i - 1][1]);
            }
        }
        ret.push_back(intervals.back());
        return ret;
    }
};

