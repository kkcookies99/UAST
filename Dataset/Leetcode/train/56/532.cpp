 class Solution {
public:
    static bool cmp(vector<int>& a, vector<int>& b){
        return a[0]<b[0];
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if(intervals.size()<2)
            return intervals;
        vector<vector<int>> res;
        sort(intervals.begin(), intervals.end(), cmp);
        int i=1;
        int start = intervals[0][0];
        int end = intervals[0][1];
        while(i<intervals.size()){
            if(intervals[i][0]<=end){
                end = max(end, intervals[i][1]);
            }
            else{
                res.push_back({start, end});
                start=intervals[i][0];
                end = intervals[i][1];
            }
            ++i;
        }
        res.push_back({start, end});
        return res;
    }
};

