class Solution {
public:
    int XXX(string s) {
        int l = 0;
        for (int i = s.size() - 1; i >= 0; i -- ) {
            if (s[i] != ' ') l ++ ;
            else if (l != 0) return l;
        }
        return l;
    }
};

