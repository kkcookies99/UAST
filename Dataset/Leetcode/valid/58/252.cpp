 class Solution {
public:
    int XXX(string& s) {
        int length = 0;
        for (int i = s.size() - 1; i >= 0; i--)
            if (s[i] != ' ') length++;
            else if (length > 0) break;

        return length;
    }
};

