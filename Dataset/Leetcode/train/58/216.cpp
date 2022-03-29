 class Solution {
public:
    int XXX(string s) {
        stringstream ss(s);
        vector<string> res;
        string temp;
        while(ss>>temp)res.push_back(temp);
        return res.back().length();
    }
};

