 class Solution {
public:
    bool XXX(string s) {
        string t;
        for (const auto& c : s) {
            if (c >= 'a' && c <= 'z') {
                t += c;
            } else if (c >= 'A' && c <= 'Z') {
                t += (c + 32);
            } else if (c >= '0' && c <= '9') {
                t += c;
            }
        }
        int i = 0, j = t.size() - 1;
        while (i < j) {
            if (t[i] != t[j]) return false;
            i++;
            j--;
        }
        return true;
    }
};

