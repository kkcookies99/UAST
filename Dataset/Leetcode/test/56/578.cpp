 class Solution {
public:
    static int cmp(vector<int>&a,vector<int>&b)
    {
        return a[0] < b[0];
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>>ans;
        sort(intervals.begin(),intervals.end(),cmp);

        int i = 0;
        while(i<intervals.size())
        {
            int a = intervals[i][0];
            int b = intervals[i][1];
            while(i+1<intervals.size())
            {
                if(intervals[i+1][0] <= b)
                {
                    b = max(b,intervals[i+1][1]);
                    i++;
                }
                else
                {
                    break;
                }
            }
            ans.push_back(vector<int>{a,b});
            i++;
        }
        return ans;
    }
}; 

