 class Solution {
public:
    bool XXX(int x) {

        string s = to_string(x);
        for (int i = 0,j = s.length() - 1; i < j; i++,j--) {
            if(s[i] == s[j]) {
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
};


