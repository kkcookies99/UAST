class Solution {
    vector<vector<int>> res;
    vector<bool> visit;
    vector<int> cur_v,num;
    int n,cur_n=0;
public:
    void fun(int i){
        cur_n++;
        visit[i]=true;
        cur_v.push_back(num[i]);
        if(cur_n==n)
            res.push_back(cur_v);
        else if(cur_n<n)
            for(int j=0;j<n;j++)
                if(!visit[j])
                    fun(j);
        visit[i]=false;
        cur_n--;
        cur_v.pop_back();
    } 
    vector<vector<int>> XXX(vector<int>& nums) {
        n=nums.size();
        visit=vector<bool>(n,false);
        num=nums;
        for(int j=0;j<n;j++)
            fun(j);
        return res;
    }
};

