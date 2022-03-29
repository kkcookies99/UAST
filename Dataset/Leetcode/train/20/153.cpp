 class Solution {
public:
    bool XXX(string s) {
        if (s.length() == 0)
            return true;
        if (s.find("()") != string::npos)
            return XXX(s.erase(s.find("()"), 2));
        if (s.find("[]") != string::npos)
            return XXX(s.erase(s.find("[]"), 2));
        if (s.find("{}") != string::npos)
            return XXX(s.erase(s.find("{}"), 2));
        return false;
    }
};

