 class Solution {
public:
    static bool compare(vector<int>& a,vector<int>& b)//按照start将区间进行升序排序
    {
        return a[0]<b[0];
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) 
    {
        sort(intervals.begin(),intervals.end(),compare);//按照start将区间进行升序排序
        vector<vector<int>> res;//创建二维数组res，保存不重叠的区间
        for(int i=0;i<intervals.size();i++)
        {
            if(i==0 || res.back()[1]<intervals[i][0])//如果之前保存在res中的end<intervals中的start，则说明区间不重叠
                res.push_back(intervals[i]);
            else//否则更新res中的end,end取res和intervals[i]中的end的最大值
                res.back()[1]=max(res.back()[1],intervals[i][1]);
        }
        return res;//返回不含有重叠区间的数组
    }
};

