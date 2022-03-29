 class Solution {
public:
    int XXX(string s) {
        int hash[26];
        int n = s.size(), res = 0;
        for (int i = 0, j = 0; i < n; i ++) {
            hash[s[i] - 97] ++;
        
            while (hash[s[i] - 97] > 1) {
                hash[s[j] - 97] --;
                j ++;
            }
            res = max(res, i - j + 1);
        }
        
        return res;
    }
};

