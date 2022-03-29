class Solution {
    vector<vector<int>> res;
    vector<int> cur_v,num;
    int n,cur_n=0;
public:
    void fun(int i){
        cur_n++;
        cur_v.push_back(num[i]);
        res.push_back(cur_v);
        if(cur_n<=n)
            for(int j=i+1;j<n;j++)
                fun(j);
        cur_n--;
        cur_v.pop_back();
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        num=nums;
        n=num.size();
        res.push_back({});
        for(int i=0;i<n;i++)
            fun(i);
        return res;
    }
};

