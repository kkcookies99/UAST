 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> res;
        sort(intervals.begin(),intervals.end());
        res.push_back(intervals[0]);
        for(int i=1;i<intervals.size();i++){
            if(intervals[i][0]>res.back()[1])
                res.push_back(intervals[i]);
            else if(intervals[i][0]==res.back()[1])
                res.back()[1] = intervals[i][1];
            else{
                if(intervals[i][1]>res.back()[1])
                    res.back()[1] = intervals[i][1];
            }   
        }
        return res;
    }
};

