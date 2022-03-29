 class Solution {
public:
    static bool cmp(vector<int> &a,vector<int> &b){
        if(a[0]==b[0]) return a[1]<b[1];
        return a[0]<b[0];
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> ans;
        if(!intervals.size()) return ans;
        
        sort(intervals.begin(),intervals.end(),cmp);
        int l=-1,r=-1;
        for(int i=0;i<intervals.size();i++){
            if(intervals[i][0]>r){
                if(r>-1)
                    ans.push_back({l,r});
                l=intervals[i][0];
                r=max(r,intervals[i][1]);
            }
            else{
                l=min(l,intervals[i][0]);
                r=max(r,intervals[i][1]);
            }
        }

        if(ans.empty() || r>ans[ans.size()-1][1]){
            ans.push_back({l,r});
        }
        return ans;
    }
};

