 class Solution {
public:
    static bool cmp(const vector<int> &v1, const vector<int> &v2) {
        if (v1[0] == v2[0]) return v1[1] > v2[1];
        return v1[0] < v2[0];
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> ans;
        int size = intervals.size();
        if (!size || size == 1) {
            if (size) ans.push_back(vector<int>{intervals[0][0], intervals[0][1]});
            return ans;
        }
        sort(intervals.begin(), intervals.end(), cmp);
        int start = intervals[0][0], end = intervals[0][1];
        for (int i = 1; i < size; ++i) {
            if (end >= intervals[i][0]) {
                end = max(end, intervals[i][1]);
            } else {
                ans.push_back(vector<int>{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
            if (i == intervals.size() - 1) ans.push_back(vector<int>{start, end});
        }
        return ans;
    }
};

