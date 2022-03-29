 class Solution {
public:
    static bool cmp(vector<int>& a, vector<int>& b) {
        if (a[0] == b[0])
            return a[1] < b[1];
        return a[0] < b[0];
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> result;
        sort(intervals.begin(), intervals.end(), cmp);
        vector<int> XXX = {intervals[0][0], intervals[0][1]};
        for (int i  = 1; i < intervals.size(); ++i) {
            if (XXX[1] >= intervals[i][0] && XXX[1] < intervals[i][1]) {
                    XXX[1] = intervals[i][1];
            }
            else if (XXX[1] >= intervals[i][1])
                continue;
            else {
                result.push_back(XXX);
                XXX[0] = intervals[i][0];
                XXX[1] = intervals[i][1];
            }
        }
        result.push_back(XXX);
        return result;
    }
};

