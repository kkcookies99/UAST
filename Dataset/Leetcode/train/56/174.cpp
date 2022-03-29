 class Solution {
public:
    static bool cmp(vector<int> a,vector<int> b){
        if(a[0]==b[0])return a[1]<=b[1];
        return a[0]<b[0];
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end(),cmp);
        vector<vector<int>> res;
        vector<int> temp(2);
        temp[0]=intervals[0][0],temp[1]=intervals[0][1];
        for(int i=1;i<intervals.size();i++){
            if(intervals[i][0]>temp[1])res.push_back(temp),temp[0]=intervals[i][0];
            temp[1]=max(temp[1],intervals[i][1]);
        }
        res.push_back(temp);
        return res;
    }
};

