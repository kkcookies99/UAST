 class Solution {
public:
    int XXX(string s) {
        set<char> sstr;
        int i = 0, len = 0;
        for (int j = 0; j < s.size(); j++) {
            if (sstr.find(s[j]) != sstr.end()) {
                sstr.erase(s[i]);
                i++;
            }
            else {
                sstr.insert(s[j]);
                len = max(len, j - i);
            }
        }
        return len;
    }
};

