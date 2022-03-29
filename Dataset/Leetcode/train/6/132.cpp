 class Solution {
public:
    string XXX(string s, int numRows) {
        int len = s.size();
        string out(len, ',');
        if (numRows <= 1)
            return s;
        int key = numRows - 1;
        int i = 0;
        int j = 0;
        while (i < len) {
            out[j] = s[i];
            ++j;
            i += key * 2;
        }
        for (int k = 1; k != key; ++k) {
            i = k;
            while (i < len) {
                out[j] = s[i];
                ++j;
                i += (key - k) * 2;
                if (i < len) {
                    out[j] = s[i];
                    ++j;
                    i += k * 2;
                }
            }
        }
        i = key;
        while (i <len) {
            out[j] = s[i];
            ++j;
            i += key * 2;
        }
        return out;
    }
};

