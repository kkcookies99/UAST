 class Solution {
public: 
    static bool cmp(vector<int> a, vector<int> b) {
        return a[0] < b[0];
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(), intervals.end(), cmp);
        vector<vector<int> > res;
        int l = intervals[0][0], r = intervals[0][1], n = intervals.size();
        for(int i = 1; i < n; i++) {
            if(intervals[i][0] > r){
                res.push_back({l, r});
                l = intervals[i][0];
                r = intervals[i][1];
            }else{
                r = max(r, intervals[i][1]);
            }
        }
        res.push_back({l, r});
        return res;
    }
};

