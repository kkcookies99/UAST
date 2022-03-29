class Solution {
public:
    bool XXX(int x) {
        string a;
        stringstream ss;
        ss << x;
        ss >> a;
        string b = a;
        reverse(b.begin(),b.end());
        return a==b;
    }
};

