 class Solution {
public:
    bool XXX(string s) {
        int i = 0, j = s.size()-1;
        while(i < j)
        {
            while(i < j && !isalnum(s.at(i))) ++i;
            while(i < j && !isalnum(s.at(j))) --j;
            if((s.at(i)|0x20) != (s.at(j)|0x20)) return false;
            ++i;
            --j;
        }
        return true;
    }
};

