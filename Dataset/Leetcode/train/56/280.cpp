 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if(intervals.empty()) return {{}};
        sort(intervals.begin(), intervals.end(), cmp);
        int end = intervals[0][1];
        int sta = intervals[0][0];
        vector<vector<int>> res;
        for(int i=1; i<intervals.size(); i++) {
            if(intervals[i][0] <= end) 
                end = max(intervals[i][1], end);
            else {
                res.push_back({sta, end});
                sta = intervals[i][0];
                end = intervals[i][1];
            }
        }
        res.push_back({sta, end});
        return res;
    }

private:
    static bool cmp(vector<int>& a, vector<int>& b) {
        return a[0] < b[0]; 
    }
};

