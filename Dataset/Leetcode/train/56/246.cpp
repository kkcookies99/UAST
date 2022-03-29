 class Solution {
public:
    bool static cmp(vector<int>&a,vector<int>&b){//排序方式，第一个元素越小排越前面，第二个元素越大排越前面
        if(a[0]!=b[0])
            return a[0]<b[0];
        else
            return a[1]>b[1];
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end(),cmp);
        vector<vector<int>> ans;
        vector<int> t;
        t.push_back(intervals[0][0]);
        t.push_back(intervals[0][1]);
        for(int i=1;i<intervals.size();i++){
            if(t[1]<intervals[i][0])//前一个区间右边界小于当前区间的左边界，说明无交集，可以把之前区间结果存下
            {
                ans.push_back(t);
                t[0]=intervals[i][0];
                t[1]=intervals[i][1];
            }else if(t[1]<intervals[i][1]){//前一个区间右边界大于等于当前区间左边界并且小于当前区间右边界，则更新右边界
                t[1]=intervals[i][1];
            //其余情况，不改变边界
            }
        }
        ans.push_back(t);//将最后生成的区间存储
        return ans;
    }
};

