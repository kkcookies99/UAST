class Solution {
public:
    int XXX(string s) {
        int n = s.length();
        while(n > 0 && s[n-1] == ' ') n--;
        for(int i=n-1; i>=0; i--) {
            if(s[i] == ' ') return n-1-i;
        }
        return n;
    }
};

