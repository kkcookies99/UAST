 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows <= 1) return s;
        vector<vector<char> > rows(numRows);
        int flag = -1;
        for(int i = 0; i < s.length(); i++) {
            if( i % ((numRows-1)) == 0) {
                flag = -flag;
            }
            if(1 == flag)
                rows[i%(numRows-1)].push_back(s[i]);
            else
                rows[numRows - 1 - i%(numRows-1)].push_back(s[i]);
        }
        string ans = "";
        for(auto vec : rows)
            for(auto ch : vec)
                ans += ch;
        return ans;
    }
};

