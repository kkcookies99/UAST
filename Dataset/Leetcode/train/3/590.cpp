 class Solution {
public:
    int XXX(string s) {
        unordered_map<char,int> map;
        int left = 0,res = 0;
        for(int i=0;i<s.size();i++){
            if(map.find(s[i])==map.end()||map[s[i]]<left){
                res = max(res,i-left+1);
            }
            else{
                if(map[s[i]]>=left){
                    left = map[s[i]] + 1;
                }
            }
            map[s[i]] = i;
        }
        return res;
    }
};

