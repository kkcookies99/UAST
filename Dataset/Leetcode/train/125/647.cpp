 class Solution {
public:
    bool XXX(string s) {
        for(int i = 0, j = s.size() - 1; i < j; i++, j--) {
            while(i != j && !isalnum(s[i])) {
                i++;
            }
            if(i == j) return true;
            while(!isalnum(s[j])) {
                j--;
            }
            if(s[i] != s[j] && (isdigit(s[i]) || isdigit(s[i]) || abs(s[i] - s[j]) != 32)) {
                return false;
            }
        }
        return true;
    }
};

