 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(), intervals.end(), [](const vector<int>& a, const vector<int>& b){return a[0] < b[0];});
        vector<vector<int>> res;
        int right = intervals[0][1], left = intervals[0][0];
        for(int i = 0; i < intervals.size(); i++){
            if(intervals[i][0] <= right){
                intervals[i][0] = left;
                intervals[i][1] = max(right, intervals[i][1]);
            }else{
                res.push_back(intervals[i - 1]);
            }
            right = intervals[i][1];
            left = intervals[i][0];
        }
        res.push_back(intervals[intervals.size() - 1]);
        return res;
    }
};

