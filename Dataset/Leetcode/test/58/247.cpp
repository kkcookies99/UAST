 class Solution {
public:
    int XXX(string s) {
        reverse(s.begin(), s.end());
        stringstream ss(s);
     
        string tmp;
        ss >> tmp;

        return tmp.size();
        
    }
};

