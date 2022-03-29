 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        int n = intervals.size();
        if(n == 0) return {};

        vector<vector<int>> res;

        sort(intervals.begin(), intervals.end(), [](const vector<int>& a, const vector<int>& b)->bool{
            return a[0] < b[0] || (a[0] == b[0] && a[1] < b[1]);
        });

        int start = intervals[0][0], end = intervals[0][1];
        for(int i = 1; i < n; i++){
            if(intervals[i][0] > end){
                res.push_back({start, end});
                start = intervals[i][0];
            }
            if(intervals[i][1] > end){
                end = intervals[i][1];
            }
        }

        res.push_back({start, end});
        return res;
    }
};

