 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> res;
        sort(intervals.begin(), intervals.end(), [](vector<int>& a, vector<int>& b)->bool{
            return a[0] < b[0];
        });
        int pos = 0;
        while(pos < intervals.size()){
            int start = intervals[pos][0], end = intervals[pos][1];
            while(pos < intervals.size() - 1 && end >= intervals[pos + 1][0]){
                end = max(end, intervals[pos + 1][1]);
                pos++;
            }
            res.push_back({start, end});
            pos++;
        }
        return res;
    }
};

