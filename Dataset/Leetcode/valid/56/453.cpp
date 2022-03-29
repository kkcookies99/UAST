 class Solution {
public:
    static bool cmp(const vector<int> &a, const vector<int> &b) {
        return a[0] < b[0];
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> result;
        sort(intervals.begin(), intervals.end(), cmp);
        for (int i = 0; i < intervals.size(); ++i) {
            if (i < intervals.size() - 1 && intervals[i][1] >= intervals[i + 1][0]) {
                intervals[i + 1][0] = intervals[i][0];
                intervals[i + 1][1] = max(intervals[i + 1][1], intervals[i][1]);
            }
            else {
                result.push_back(intervals[i]);
            }
        }
        return result;
    }
};

