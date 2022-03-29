 class Solution {
public:
    int expand(string &s, int lf, int ct, int rg) {
        while(s[lf] == s[rg]) {
            --lf;
            ++rg;
        }
        return rg - ct - 1;
    }
    string XXX(string s) {
        // 1. 字符串预处理 $#s..#&
        string ss = "$#";
        for(char c:s) {
            ss += c;
            ss += '#';
        }
        ss += '&';
        
        int center, right = -1, maxlen = 1, start = 2;
        int n = s.size();
        int L[2 * n];
        n = n * 2;
        for(int i = 2; i < n; ++i) {
            int cur;
            if(i < right) {
                int lg = min(right - i, L[2 * center - i]);
                cur = expand(ss, i - lg,i, i + lg);
            }else cur = expand(ss, i - 1, i, i + 1);
            
            L[i] = cur;
            if(i + cur > right) {
                center = i;
                right = i + cur;
            }
            if(cur > maxlen) {
                maxlen = cur;
                start = i;
            }
        }
        return s.substr((start - maxlen - 1)/2, maxlen);
    }
        
};

