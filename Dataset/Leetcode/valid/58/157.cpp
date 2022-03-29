 class Solution {
public:
    int XXX(string s) {
        int res = 0,n = s.size()-1;
        while(n>=0 && s[n]==' ') n--;
        while(n>=0 && s[n]!=' ') {
            n--;res++;
        }
        return res;
    }
};

