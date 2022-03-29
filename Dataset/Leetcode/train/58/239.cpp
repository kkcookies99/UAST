 class Solution {
public:
    int XXX(string s) {
        auto tmp = find_if(s.rbegin(), s.rend(), ::isalpha);
        return find(tmp, s.rend(), ' ') - tmp;
    }
};

