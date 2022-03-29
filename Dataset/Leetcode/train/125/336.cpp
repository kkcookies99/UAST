 class Solution {
public:
    bool isEqual(char a, char b)
    {
        if (a == b) return true;
        if (tolower(a) == tolower(b)) return true;
        return false;      
    }
    bool XXX(string s) {
        if (s.size() <= 1) return true;
        int i = 0, j = s.size() - 1;
        while (i < j)
        {
            while (i < j && !isalnum(s[i])) i ++;
            while (i < j && !isalnum(s[j])) j --;
            if (isEqual(s[i], s[j])) i ++, j --;
            else return false;
        }
        return true;
    }
};

