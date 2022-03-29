class Solution {
public:
    int XXX(string s) {
        stringstream ss;
        ss << s;
        string last;
        while(ss)
            ss >> last;
        return last.length();
    }
};

