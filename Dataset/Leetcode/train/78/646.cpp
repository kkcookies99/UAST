 class Solution {
public:
    vector<vector<int>> vv;
    vector<int> n;
    vector<vector<int>> XXX(vector<int>& nums) {
        n=nums;
        vector<int> t;
        dfs(0,t);
        return vv; 
    }
    void dfs(int index,vector<int> t){
        vv.push_back(t); 
        for(int i=index;i<n.size();++i){
            t.push_back(n[i]);
            dfs(i+1,t);
            t.pop_back();
        }
        return;
    }
};

