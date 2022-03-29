class Solution {
public:
    int XXX(string s) {
        istringstream in(s);
        string dump;
        while(in)
            in >> dump;
        return dump.size();
    }
};

