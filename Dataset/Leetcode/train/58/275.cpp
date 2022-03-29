 class Solution {
public:
    int XXX(string s) {
        int n = s.length();
        int j = n - 1;
        while (s[j] == ' ')j--;
        int res = 0;
        while (j >= 0 && s[j] != ' ')j--,res++;
        return res;
    }
};

