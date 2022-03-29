 class Solution {
public:
    bool XXX(string s) {
        const char *p = s.c_str() - 1, *q = p + 1 + s.size();
        while (p < q){
            while (p < q && !isalnum(*++p));
            while (p < q && !isalnum(*--q));
            if (tolower(*p) != tolower(*q)) return false;
        }
        return true;
    }
};

