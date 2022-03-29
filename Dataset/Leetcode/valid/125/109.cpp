 class Solution {
public:
    bool XXX(string s) {
        int i=0;
        int j=s.size()-1;
        
        transform(s.begin(), s.end(),s.begin(), ::tolower);
        while(i<j) {
            if(!isalnum(s[i])) {
                ++i;continue;
            }
            if(!isalnum(s[j])) {
                --j;continue;
            }
            if(s[i++] != s[j--])
                return false;
        }
        return true;
    }
};

