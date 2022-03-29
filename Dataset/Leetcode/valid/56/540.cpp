 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        // 先排序，后合并，时间复杂度O(nlogn + n)=O(nlogn)
        sort(intervals.begin(), intervals.end(), [](vector<int> a, vector<int> b){
            return a[0] < b[0] ? true : (a[0] == b[0] && a[1] < b[1] ? true : false);
        });
        vector<vector<int>> res;
        int n = intervals.size();
        vector<int> tmp(2,0);
        tmp[0] = intervals[0][0], tmp[1] = intervals[0][1];
        for (int i = 1; i < n; i++){
            if (intervals[i][0] <= tmp[1]){
                if (intervals[i][1] > tmp[1]) tmp[1] = intervals[i][1];
            }else{
                res.push_back(tmp);
                tmp[0] = intervals[i][0], tmp[1] = intervals[i][1];
            }
        }
        res.push_back(tmp);
        return res;
    }
};

