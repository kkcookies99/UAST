 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        
        sort(intervals.begin(),intervals.end());
        int beg = 0 ;
        int end = 1;
        vector<vector<int>> res; 
        if(intervals.empty()) return res;
        while(end < intervals.size()){
            if(intervals[beg][1] >= intervals[end][0]){
                intervals[beg][1] = max(intervals[beg][1],intervals[end][1]);
                end++;
            }
            else{
                res.push_back(vector<int>{intervals[beg][0],intervals[beg][1]});
                beg = end;
                end++;
            }
        }
        res.push_back(vector<int>{intervals[beg][0],intervals[beg][1]});
        return res;
    }
};