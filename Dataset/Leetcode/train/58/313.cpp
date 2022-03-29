 class Solution {
public:
    int XXX(string s) {
        istringstream iss(s);
        while (iss) {
            iss >> s;
        }
        return s.size();
    }
};

