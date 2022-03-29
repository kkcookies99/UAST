class Solution {
public:
    int XXX(string s) {
        int ans = 0, i = s.size()-1;
        while (i>=0&&!isalpha(s[i])) i--;
        while (i>=0&&isalpha(s[i--])) ans++;
        return ans;
    }
};

