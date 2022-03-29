 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>>ans;sort(intervals.begin(),intervals.end());
        int size=intervals.size(),left=intervals[0][0],right=intervals[0][1];
        if(size==1){return intervals;}
        for(int i=1;i<size;i++)
        {
            if(right<intervals[i][0]){ans.push_back({left,right});left=intervals[i][0];right=intervals[i][1];}
            else{
                right=max(intervals[i][1],right);
            }
        }
        ans.push_back({left,right});
        return ans;
    }
};

