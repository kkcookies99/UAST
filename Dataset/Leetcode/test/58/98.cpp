 class Solution {
public:
    int XXX(string s) {
        int n=s.size()-1;
        while(s[n]==' '){
            s[n]='*';
            --n;
        }
        return n-s.rfind(" ");
    }
};

