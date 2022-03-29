 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> res;
        sort(intervals.begin(),intervals.end());
        
        for(int i=0;i<intervals.size();i++){
            int L=intervals[i][0],R=intervals[i][1],tmpi=i;
            while(i+1<intervals.size() && intervals[i+1][0]<=R){
                R=max(R,intervals[i+1][1]);
                i++;
            }
            res.push_back({L,R});
        }
        return res;
    }
};

