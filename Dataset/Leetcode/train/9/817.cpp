 class Solution {
public:
    bool XXX(int x) {
        if (x < 0) return false;
        string str1 = to_string(x);
        string str2 = str1;
        reverse(str2.begin(), str2.end());
        if (str1 == str2) return true;
        else return false;
    }
};

