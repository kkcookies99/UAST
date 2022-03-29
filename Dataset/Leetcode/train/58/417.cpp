class Solution {
public:
    int XXX(string s) {
        auto j = s.rbegin();
        int i = 0;
        while (j != s.rend()) {
            if (*j != ' ')
                i++;
            j++;
            if (i != 0 && *j == ' ')
                break;
        }
        return i;
    }
};

