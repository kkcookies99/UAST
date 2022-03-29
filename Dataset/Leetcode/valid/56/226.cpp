 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector <vector<int>> ans;
        int n = intervals.size();
        sort(intervals.begin(), intervals.end());
        int st = -2e9, ed = -2e9;
        for(int i = 0; i < n;i ++){
            if(ed < intervals[i][0]) {
            if(st != -2e9)ans.emplace_back(vector <int>{st, ed});
                st = intervals[i][0], ed = intervals[i][1];
            }
            else ed = max(ed, intervals[i][1]);
        }
        if(st != -2e9) ans.emplace_back(vector <int>{st, ed});
        return ans;
    }
};

