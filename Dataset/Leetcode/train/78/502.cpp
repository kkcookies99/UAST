 class Solution {
public:
    vector<vector<int>>  ans;
    vector<int> data;
    int n_size;
    void dfs(int u,vector<int> s){
        if(u == n_size){
            return;
        }
        for(int i = u;i<n_size;i++){
            s.push_back(data[i]);
            ans.push_back(s);
            dfs(i + 1,s);
            s.pop_back();
        }
       
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        n_size = (int)nums.size();
        vector<int> tmp;
        ans.push_back(tmp);
        data = nums;
        dfs(0,tmp);
        return ans;
    }
};

