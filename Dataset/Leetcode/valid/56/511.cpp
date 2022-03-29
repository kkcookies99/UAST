 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        /*对区间按照起始位置升序排序，如果前一个的结束位置大于后一个的开始位置则要合并，
        合并后区间的结束位置为两区间结束位置的较大者*/
        sort(intervals.begin(), intervals.end(), [](vector<int> a, vector<int> b){return a[0] < b[0];});
        vector<vector<int>> res;
        res.push_back(intervals[0]);
        vector<int> tempvec;
        for(int i = 1; i < intervals.size(); i++)
        {
            if(res.back()[1] >= intervals[i][0])
            {
                tempvec = res.back();
                res.pop_back();
                tempvec[1] = max(tempvec[1], intervals[i][1]);
                res.push_back(tempvec);
            }
            else
                res.push_back(intervals[i]);
        }
        return res;
    }
};

