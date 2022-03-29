 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if(intervals.size() == 1)
            return {{intervals[0][0], intervals[0][1]}};
        sort(intervals.begin(), intervals.end(), cmp);
        int left = intervals[0][0];
        int right = intervals[0][1];
        vector<vector<int>> res = {};
        for(int i = 1; i < intervals.size(); i++){
            if(intervals[i][0] > right){
                res.push_back({left, right});
                left = intervals[i][0];
                right = intervals[i][1];
            }else{
                right = max(right, intervals[i][1]);
            }
        }
        res.push_back({left, right});
        return res;
    }
    static bool cmp(vector<int>& v1, vector<int>& v2){
        return v1[0] < v2[0];
    }
};

