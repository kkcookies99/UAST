 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int >> res;  
        if(intervals.empty())
            return res;
        if(intervals.size() == 1)
            return intervals;
        sort(intervals.begin(),intervals.end(),[](auto &a,auto &b){
            return a[0] < b[0];
        });
        int n = intervals.size();
        for(int i=1;i < n;i++){//注意设置i为1
            if(intervals[i-1][1] >= intervals[i][0]){ //每次和前一个数组对比，看是否有相同区间
                intervals[i][0] = min(intervals[i-1][0],intervals[i][0]);//[1,4][0,3]类似的情况
                intervals[i][1] = max(intervals[i-1][1],intervals[i][1]);//[1,4][2,3]类似的情况
            }else{
                res.push_back(intervals[i-1]);
            }
        }
        res.push_back(intervals[n-1]);//注意把最后一个数组加入结果中
        return res;
    }
};

