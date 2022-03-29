 class Solution {
public:
    bool XXX(string s) {
        int i = 0;
        std::transform(s.begin(), s.end(), s.begin(), (int (*)(int))std::toupper);
        for (int i = 0; i < s.length();){
            char tmp = s.at(i);
            int ti = s.find(tmp);
            if ((tmp > 47 && tmp < 58) || (tmp > 64 && tmp < 91)) i++;
            else s.erase(ti,1);
        }
        int ls = s.size();
        for (int i = 0; i < ls/2; i++){
            if (s[i]!=s[ls-i-1]) return false;
        }
        return true;
    }
};

