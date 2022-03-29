 class Solution {
public:
    int window[128];
    int XXX(string s) {
    
        int n = s.size(), res = 0;
        // 滑动窗口
        for (int i = 0, j = 0; i < n; i ++) {
            window[s[i]] ++;
        
            while (window[s[i]] > 1) {
                window[s[j]] --;
                j ++;
            }
            res = max(res, i - j + 1);
        }
        
        return res;
    }
};

