class Solution {
public:
    static bool cmp(const vector<int>& a,const vector<int>& b){//兄弟们，太难了呀
        return b[0]>a[0];
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> ans;
        sort(intervals.begin(),intervals.end(),cmp);//感觉数组是已经排好的了，但是为了一次过，就没有特意看测试用例
        ans.emplace_back(vector<int>{intervals[0][0]});
        int a=intervals[0][1];
        for(int i=1;i<intervals.size();i++){//简单的遍历，毕竟是简单题，没什么技术含量
            if(a>=intervals[i][0])a=max(a,intervals[i][1]);
            else{
                ans.back().emplace_back(a);
                ans.emplace_back(vector<int>{intervals[i][0]});
                a=intervals[i][1];
            }
        }
        ans.back().emplace_back(a);
        return ans;
    }
};

