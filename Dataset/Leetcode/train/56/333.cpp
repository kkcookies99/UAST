 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if(intervals.size()==0)
            return {};
        sort(intervals.begin(),intervals.end());
        vector<vector<int>> res;
        res.push_back(intervals[0]);
        for(int i=1;i<intervals.size();i++){
            int left = intervals[i][0];
            int right = intervals[i][1];
            if(left>res.back()[1]){
                res.push_back(intervals[i]);
            }else{
                res.back()[1] = max(right,res.back()[1]);
            }
        }
        return res;
    }
};

