 class Solution {
public:
    string XXX(vector<string>& strs) {
        int n = strs.size();
        string ans;
        
        while(!strs[0].empty()){
            char t = strs[0][0];
            for(auto& item : strs){
                if(t != item[0]) return ans;
                item.erase(0, 1);
            }
            ans += t;
        }
        return ans;
    }
};

