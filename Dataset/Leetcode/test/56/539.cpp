 class Solution {
public:
    //有一种更优雅的解法
    //先排序 然后放入最开始的节点
    //然后不断更新右边的节点
    static bool cmp(vector<int> &a, vector<int> &b){
        if(a[0]==b[0]) return a[1]<b[1];
        return a[0]<b[0];
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> ans;
        if(!intervals.size()) return ans;

        sort(intervals.begin(),intervals.end(),cmp);
        ans.push_back(intervals[0]);//先放入进去 大不了后面在更新
        for(int i=1;i<intervals.size();i++){
            if(intervals[i][0]>ans.back()[1]){
                ans.push_back(intervals[i]);
            }
            else{
                ans.back()[1]=max(ans.back()[1],intervals[i][1]);
            }
        }

        return ans;
    }
};

