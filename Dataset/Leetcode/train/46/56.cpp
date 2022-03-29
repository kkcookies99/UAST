class Solution {
public:
    vector<vector<int>> ret;
    void search(vector<int> p,  vector<int> now){
        if(p.size() == now.size()){
            ret.push_back(now);
            return;
        }
        for(int i =0 ;i < p.size();i ++){
            bool ok = true;
            for(int j =0 ;j < now.size();j ++){
                if(now[j] == p[i]){
                    ok = false;
                    break;
                }
            }
            if(ok){
                vector<int> tmp = now;
                tmp.push_back(p[i]);
                search(p,tmp);
            }
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int> a;
        search(nums,a);
        return ret;
    }
};


