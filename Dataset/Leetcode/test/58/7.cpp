 class Solution {
public:
    int XXX(string s) {
        int n = s.length();
        int i,j;
        for (i = n-1; i >= 0; i--)
            if ((s[i] >= 'a' && s[i] <= 'z') || (s[i] >= 'A' && s[i] <= 'Z'))
                break;
        for (j = i-1; j >= 0; j--)
            if (s[j] == ' ')
                break;
        return i - j;
    }
};

