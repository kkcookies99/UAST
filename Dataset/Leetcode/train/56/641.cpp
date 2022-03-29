 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> res;
   
        if(intervals.empty()){
            return res;
        }

        res.reserve(intervals.size());
        sort(intervals.begin(), intervals.end(), [](const vector<int> &a, const vector<int>&b){
            return a[0] < b[0];
        });



        vector<int> &prev = intervals[0];
        for(int i =0 ; i < intervals.size() ;i++){
            if(prev[1] >= intervals[i][0]){
                prev[1] = intervals[i][1] >  prev[1]  ? intervals[i][1] : prev[1];
        
            }else{
                res.emplace_back(prev);
                prev = intervals[i];
            }
        }


        if(prev[1] >= intervals[intervals.size() - 1][0])
            res.emplace_back(prev);


        return res;
        
    }
};

