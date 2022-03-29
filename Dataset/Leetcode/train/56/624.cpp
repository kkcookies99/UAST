 class Solution {
public:
    // 题解：区间贪心
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if(intervals.empty())return {};
        // 先排左端点，在排右端点
        // 若左端点不同，按左端点由小到大排序；若左端点相同，则按右端点由小到大排序
        sort(intervals.begin(),intervals.end());

        vector<vector<int>> res;
        res.push_back(intervals[0]);
        for(int i=1;i<intervals.size();++i)
        {
            // 区间i的左端点<=维护区间的右端点，表示区间有交集，需要进行合并
            if(intervals[i][0]<=res.back()[1])
            {
                res.back()[1]=max(res.back()[1],intervals[i][1]);
            }
            // 区间无交集，表示找到一个新的区间，更新维护区间
            else
            {
                res.push_back(intervals[i]);
            }
        }

        return res;
    }
};

