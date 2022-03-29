 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end());
        vector<vector<int>> res;
        for(int i=0;i<intervals.size();i++){
            vector<int> v=intervals[i];
            while(i<intervals.size()-1&&intervals[i+1][0]<=v[1]){
                v[1]=max(intervals[i+1][1],v[1]);
                i++;
            }
            res.push_back(v);
        }
        return res;
    }
};

