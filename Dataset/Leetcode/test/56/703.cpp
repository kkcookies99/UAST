 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if(intervals.size() == 0) return {};
        sort(intervals.begin(), intervals.end());
        vector<vector<int>> XXXd;
        for(auto interval : intervals) {
            if(!XXXd.size() || XXXd.back()[1] < interval[0]) {
                XXXd.push_back(interval);
            } else {
                XXXd.back()[1] = max(XXXd.back()[1], interval[1]);
            }
        }
       return XXXd; 
    }
};

