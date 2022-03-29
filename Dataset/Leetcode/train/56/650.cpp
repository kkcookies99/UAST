 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        int l=intervals.size();        
        if(l==0||l==1) return intervals;
        vector<vector<int>> res;   
        sort(intervals.begin(),intervals.end());
        res.push_back(intervals[0]);
        int c=0;
        for(int i=1;i<l;++i){
           if(intervals[i][0]<=res[c][1]){
               res[c][1]=max(intervals[i][1],res[c][1]);
           }
           else if(intervals[i][0]>res[c][1]){
               res.push_back(intervals[i]);
               c++;
           }
        }
        return res;

    }
};

