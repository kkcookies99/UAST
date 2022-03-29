 class Solution {
public:
    static bool comp(vector<int> First, vector<int> Second){
        return First[0] < Second[0];
    }
// 只能使用<不能用<=，否则无法通过
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> result;
        if(intervals.empty()){
            return result;
        }
        sort(intervals.begin(), intervals.end(), comp);
        int low = intervals[0][0], high = intervals[0][1];
        for(int i = 1; i < intervals.size(); i++){
            if(intervals[i][0] <= high){
                high = max(high, intervals[i][1]);
            }else{
                result.push_back(vector<int>{low, high});
                low = intervals[i][0];
                high = intervals[i][1];
            }
        }
        result.push_back(vector<int>{low, high});
        return result;
    }
};

