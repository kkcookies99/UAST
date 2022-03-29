 class Solution {
public:
    int XXX(string s) {
        int last[256];
        memset(last, -1, sizeof last);
        int res = 0, cur = 0;
        for(int i=0;i<s.length();i++){
            cur = min(cur + 1, i - last[s[i]]);
            last[s[i]]=i;
            res = max(res, cur);
        }
        return res;
    }
};

