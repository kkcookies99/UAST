 class Solution {
public:
    int XXX(string s) {
        int sLen = s.length();
        int maxLen = 0;
        int resLen = 0;
        bool existNum[128] = { false };
        vector<int> existNumIndex(128, -1);
        for (int i = 0; i < sLen; ++i) {

            if (existNum[s[i]]) {
                
                if (i == (sLen - 1) && (i - existNumIndex[s[i]]) > resLen) {
                    resLen++;
                    maxLen = (maxLen > resLen ? maxLen : resLen);
                } else {
                    maxLen = (maxLen > resLen ? maxLen : resLen);
                    resLen = (i - existNumIndex[s[i]] > resLen ? ++resLen : i - existNumIndex[s[i]]);
                }

            } else {
                existNum[s[i]] = true;
                resLen++;
            }
            existNumIndex[s[i]] = i;
        }
        if (resLen == sLen) {
            return sLen;
        }
        return max(maxLen, resLen);
    }
};

