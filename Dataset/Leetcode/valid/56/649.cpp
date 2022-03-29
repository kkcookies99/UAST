 class Solution {
public:
    static bool comp(const vector<int> &a,const vector<int> &b){
        return a[0]<b[0];
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        int len=intervals.size();
        vector<int> mem(len,1);//用一个额外的数组记录区间是否已被合并即弃用
        vector<vector<int>> res;
        sort(intervals.begin(),intervals.end(), comp);
        for(int i=1;i<len;++i){
            if(intervals[i-1][1]>=intervals[i][0]){
                intervals[i][0]=min(intervals[i-1][0],intervals[i][0]);
                intervals[i][1]=max(intervals[i-1][1],intervals[i][1]);//防止[1, 9] [2, 6]这种情况
                mem[i-1]=0;
            }
        }
        for(int i=0;i<len;++i){
            if(mem[i]==1){
                res.push_back(intervals[i]);
            }
        }
        return res;
    }
};

