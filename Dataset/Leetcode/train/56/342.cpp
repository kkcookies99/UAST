 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> res={};
        sort(intervals.begin(),intervals.end());
        for(auto item : intervals){
            if(res.size() == 0) res.push_back(item);
            else{
                if(item[0] <= res.back()[1]){
                    if(item[1] > res.back()[1]) res.back()[1] = item[1];
                }else{
                    res.push_back(item);
                }
            }
        }
        return res;
    }
};

