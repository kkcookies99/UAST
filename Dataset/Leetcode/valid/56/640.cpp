 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end());
        vector<vector<int>> res;
        res.push_back(intervals[0]);
        for(int i=1,j=0;i<intervals.size();i++){
            if(res[j][1]<intervals[i][0]){
                j++;
                res.push_back(intervals[i]);
            }else{
                res[j][1]=max(res[j][1],intervals[i][1]);
            }
        }
        
        return res;
    }
};```

