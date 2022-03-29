 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        int row = intervals.size();
        if(row == 0)
            return intervals;
        int col = intervals[0].size();
        
        //先对容器数组按照每行的第一个数据排序
        sort(intervals.begin(), intervals.end(), [](vector<int> a, vector<int> b) {return a[0] < b[0];});
        vector<vector<int>> res;      //结果保存在此容器中
        vector<int> tmp = {intervals[0][0], intervals[0][1]};
        res.push_back(tmp);

        for(int i = 1; i < row; i++)
        {
            tmp = res[res.size()-1];
            //取出interveral中的i行元素
            vector<int> inter = {intervals[i][0], intervals[i][1]};      
            if (inter[0] <= tmp[1])
            {
                int left = tmp[0];
                int right = inter[1] > tmp[1] ? inter[1] : tmp[1];
                tmp = {left, right};
                res.pop_back();
                res.push_back(tmp);
            }
            else
                res.push_back({inter[0], inter[1]});
        }
        return res;
    }
};

