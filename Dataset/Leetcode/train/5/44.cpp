 class Solution {
public:
    string XXX(string s) {
        int start = 0, end = 0, len = 0, g_start = 0, i = 0, n = s.size();
        while(i<n) {
            start = i, end = i;
            while(i+1<n && s[end] == s[end+1]) end++ ;
            i = end + 1;
            while(start-1>=0 && end+1<n && s[end+1] == s[start-1]) {
                start-- ;
                end++ ;
            }
            if(end - start + 1 > len) {
                len = end - start + 1;
                g_start = start;
            }
        }
        return s.substr(g_start, len);
    }
};

