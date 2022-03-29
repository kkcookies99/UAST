class Solution {
public:
    static bool cmp(vector<int>&a, vector<int> &b)
    {
        return a[0]<b[0];
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> ans;
        sort(intervals.begin(), intervals.end(), cmp);
        int left,right;
        left = intervals[0][0];
        right = intervals[0][1];
        for(int i=1;i<intervals.size();i++)
        {
            if(intervals[i][0]>right)
            {
                ans.push_back({left,right});
                left = intervals[i][0];
                right = intervals[i][1];
            }
            else
            {
                //left = min(left, intervals[i][0]);
                right = max(right, intervals[i][1]);
            }
        }
        ans.push_back({left,right});
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


