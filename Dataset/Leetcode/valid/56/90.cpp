class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if(intervals.size()==1)
            return intervals;
        vector<vector<int>> res;
        sort(intervals.begin(),intervals.end());
        // 这道题的贪心排序第一个数好点
        int end = intervals[0][1];
        res.push_back(intervals[0]);
        for(int i = 1;i<intervals.size();i++){
            if(end>=intervals[i][0]){
                // 重合,合并
                res.back()[1] = max(intervals[i][1],end);//更新界限
            }else{
                res.push_back(intervals[i]);
            }
            end = max(intervals[i][1],end);
        }
        return res;
    }
};

