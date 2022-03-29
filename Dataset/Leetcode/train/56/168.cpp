 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> ans;
        sort(intervals.begin(), intervals.end());
        int i=0;
        int len=intervals.size();
        
        for (i;i<len;++i){
            if(i==len-1){
            ans.push_back({intervals[i][0],intervals[i][1]});
            continue;}
            int j=i+1;
            if(intervals[i][1]>=intervals[j][0]){           
                // while (intervals[i][1]>=intervals[j][0]&&j<len){
                // intervals[i][1]=max(intervals[j][1],intervals[i][1]);
                // j++;}
                for (j;j<len;j++){
                    if(intervals[i][1]<intervals[j][0]||j==len)
                    break;
                    intervals[i][1]=max(intervals[j][1],intervals[i][1]);

                }
                ans.push_back({intervals[i][0], intervals[i][1]});
                i=j-1;}

            else if(intervals[i][1]<intervals[i+1][0])
            ans.push_back({intervals[i][0], intervals[i][1]}); 
        }
        return ans;
    }
};
