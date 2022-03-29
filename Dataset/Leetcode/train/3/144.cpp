 class Solution {
public:
    int XXX(string s) {
        int hashTable[256] = {0}, res = 0, left = 0;
        for (int i = 0; i < s.size(); ++i)
        {
            if (hashTable[s[i]] == 0)
            {
                res = max(res, i - left + 1);
            }
            else
            {
                left = hashTable[s[i]];
            }
            hashTable[s[i]] = i + 1;
        }
        return res;
    }
};

