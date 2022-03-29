class Solution {
public:
    map<int,int> m;
    int n;
    vector<int> v;
    vector<vector<int>> ret;
    void dfs(int cur){
        if(cur==n){
            ret.push_back(v);
            return;
        }
        map<int,int>::iterator it;
        for(it = m.begin();it!=m.end();it++){
            if(it->second==0){
                v[cur] = it->first;
                it->second = 1;
                dfs(cur+1);
                it->second = 0;
            }
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        for(auto &i:nums) m[i]=0;
        n = nums.size();
        v.resize(n);
        dfs(0);
        return ret;
    }
};

