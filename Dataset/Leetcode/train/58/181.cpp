 class Solution {
public:
    int XXX(string s) {
        int k = 0, j = s.size() - 1;
        while (j >= 0 && s[j] == ' ') {
                j--;
        }
        for (int i = j; i >= 0; i--) {
            if (s[i] == ' ')
                break;
            else
                k++;
        }
        return k;
    }
};


