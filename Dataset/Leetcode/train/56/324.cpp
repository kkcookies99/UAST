 class Solution {
public:
    static bool cmp(vector<int>& a,vector<int>& b){
        return a[0]<b[0];
    }

    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end(),cmp);
        vector<vector<int>> ans;
        int n=intervals.size();
        int i=0;
        while(i<n){
            int start=intervals[i][0];
            int end=intervals[i][1];
            int k=i;
            while(i<n && end>=intervals[i][0]){//只要当前end比下一数组中end大
                end=max(end,intervals[i][1]);//就一直兼并
                i++;
            }
            ans.push_back({start,end});
            if(k==i) i++;
        }
        return ans;
    }
};

