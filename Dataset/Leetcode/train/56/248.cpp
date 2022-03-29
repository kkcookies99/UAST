 class Solution {
public:
    int diff[10010];
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> ans;
        sort(intervals.begin(),intervals.end());
        ans.push_back({intervals[0]});
        for(int i = 1;i < intervals.size();i ++)
        {
            if(ans.back()[1] < intervals[i][0])//没有重叠
            {
                ans.push_back(intervals[i]);
            }
            else//有重叠
            {
                ans.back()[1] = max(ans.back()[1],intervals[i][1]);
            }
        }
        return ans;
    }
};

