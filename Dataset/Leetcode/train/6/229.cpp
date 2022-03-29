 class Solution {
public:
    string XXX(string s, int numRows) {
        if (numRows == 1) return s;
        int lenT = 2 * numRows - 2;
        string ans;
        for (int i = 0; i < numRows; ++i)
            for (int j = 0; i + j < s.size(); j += lenT) {
                ans.push_back(s[i+j]);
                if (i != 0 && i != numRows - 1 && lenT - i + j < s.size())
                    ans.push_back(s[lenT-i+j]);
            }
        return ans;
    }
};

