 class Solution {
public:
    int XXX(string s) {
        int n = s.size();
        if(n==0) return 0;
        if(n>=2){
            if(s[0]=='I' && s[1]=='V') return 4+XXX(s.substr(2,n-2));
            else if(s[0]=='I' && s[1]=='X') return 9+XXX(s.substr(2,n-2));
            else if(s[0]=='X' && s[1]=='L') return 40+XXX(s.substr(2,n-2));
            else if(s[0]=='X' && s[1]=='C') return 90+XXX(s.substr(2,n-2));
            else if(s[0]=='C' && s[1]=='D') return 400+XXX(s.substr(2,n-2));
            else if(s[0]=='C' && s[1]=='M') return 900+XXX(s.substr(2,n-2)); 
        }
        if(s[0]=='M') return 1000+XXX(s.substr(1,n-1));
        else if(s[0]=='D') return 500+XXX(s.substr(1,n-1));
        else if(s[0]=='C') return 100+XXX(s.substr(1,n-1));
        else if(s[0]=='L') return 50+XXX(s.substr(1,n-1));
        else if(s[0]=='X') return 10+XXX(s.substr(1,n-1));
        else if(s[0]=='V') return 5+XXX(s.substr(1,n-1));
        else return 1+XXX(s.substr(1,n-1));
    }
};

