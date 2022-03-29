 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(), intervals.end(), []
        (const vector<int> &a, const vector<int> &b) -> bool {
            if (a[0] == b[0]) return a[1] > b[1];
            return a[0] < b[0];
        });
        int n = intervals.size();
        vector<vector<int>> res;
        for (int i = 0; i < n;) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            i++;
            while(i < n && intervals[i][0] <= end) {
                end = max(end, intervals[i][1]);
                i++;
            }
            res.push_back({start, end});
        }
        return res;
    }
};code block

