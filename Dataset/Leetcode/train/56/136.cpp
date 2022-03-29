 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> ans;
        sort(intervals.begin(),intervals.end());
        int n=intervals.size();
        for(int i=0;i<n;){
            int j=i+1;
            int max=intervals[i][1];
            while((j<n)&&intervals[j][0]<=max){
                if(intervals[j][1]>max)
                    max=intervals[j][1];
                j++;
            }
            ans.push_back({intervals[i][0],max});
            i=j;
        }
        return ans;
    }
};

