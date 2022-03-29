 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if (intervals.size() <= 1){
            return intervals;
        }
        sort(intervals.begin(), intervals.end());
        int n = intervals.size();
        vector<vector<int>> newArray;

        for (int i = 0; i < n; i++){
            if (intervals[i][1] >= intervals[i + 1][0]){
                intervals[i][1] = max(intervals[i + 1][1], intervals[i][1]);
            }
            else {
                newArray.push_back(intervals[i]);
            }
        }
        return newArray;
    }
};

