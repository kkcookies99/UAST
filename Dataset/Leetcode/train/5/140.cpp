 class Solution {
public:
    bool isPalindrome(string x) {
        string rxs;
        for(int i = x.size() - 1; i >= 0; i--)
            rxs += x[i];
        if(x == rxs) return true;
        return false;
    }

    string XXX(string s) {
        string res;
        for(int i = 0, j = 0; i < s.size(); ++i) {
            j = i;
            while(j < s.size()) {
                if(isPalindrome(s.substr(i, j - i + 1)))
                    if(res.size() < s.substr(i, j - i + 1).size())
                        res = s.substr(i, j - i + 1);
                ++j;
            }
        }
        return res;
    }
};

