 class Solution {
public:
    int getValue(const char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        } return 0;
    }
    int XXX(string s) {
        int res = 0,cur = 0,next = 0;
        for(size_t i = 0;i < s.size();++i){
            cur = getValue(s[i]);
            if(i+1 < s.size()) next = getValue(s[i+1]);
            if(cur >= next) res += cur;
            else res -= cur;
        }
        return res;
    }
};

