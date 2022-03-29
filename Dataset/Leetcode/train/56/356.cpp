 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals)
    {
        vector<vector<int>> ans;
        const int n = intervals.size();
        std::sort(intervals.begin(),intervals.end(),[](vector<int> &a,vector<int>&b){return a[1] < b[1] ;});
        vector<int> tmp = intervals[n-1];
        for(int i = n -2; i >= 0; i--)
        {
            if(tmp[0] > intervals[i][1])
            {
                ans.push_back(tmp);
                tmp = intervals[i];
            }
            else if(tmp[0] >= intervals[i][0])
            {
                tmp[0] = intervals[i][0];
            }
            else{
                ;
            }
        }
        ans.push_back(tmp);
        return ans;
    }
};

