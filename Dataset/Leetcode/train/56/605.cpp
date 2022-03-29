 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>> &intervals) {
        if (intervals.size() <= 1) {
            return intervals;
        }
        sort(intervals.begin(), intervals.end(), [](auto &a, auto &b) {
            if (a[0] != b[0]) {
                return a[0] < b[0];
            }
            // a[0]一定小于等于b[0],但a[1]可能大于b[1],因为决定大小可能在0就已经确定了
            return a[1] < b[1];
        });
        vector<vector<int>> rs;
        int left = intervals[0][0], right = intervals[0][1];
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals[i][0] <= right) {
                right = max(right, intervals[i][1]);
            } else {
                rs.push_back(vector<int>{left, right});
                left = intervals[i][0];
                right = intervals[i][1];
            }
        }
        rs.push_back(vector<int>{left, right});
        return rs;
    }
};```

