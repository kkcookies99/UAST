 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(), intervals.end(), [](vector<int>& a, vector<int>& b) {
            return a[0] < b[0];
        });
        vector<vector<int>> res;
        res.push_back(intervals[0]);
        for(int i = 1; i < intervals.size(); ++i) {
            if(intervals[i][1] > res.back()[1] && intervals[i][0] <= res.back()[1]) {
                res.back()[1] = intervals[i][1];
            }
            else if(intervals[i][0] > res.back()[1]) {
                res.push_back(intervals[i]);
            }
        }
        return res;
    }
};

