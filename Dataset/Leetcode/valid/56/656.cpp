 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if(intervals.size()<2) return intervals; 
        
        sort(intervals.begin(),intervals.end());

        vector<vector<int>> ret;
        ret.push_back(intervals[0]);
        for(int i = 0 ;i<intervals.size();i++){
            if(intervals[i][0]<=ret.back()[1]){
                vector<int> newitem{ret.back()[0],max(intervals[i][1],ret.back()[1])};
                ret.pop_back();
                ret.push_back(newitem);
            }else{
                ret.push_back(intervals[i]);
            }

        }
        return ret;
    }
};

