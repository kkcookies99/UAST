 class Solution {
public:
    string XXX(string s, int numRows) {
        if (numRows == 1)
            return s;
        int n = min(numRows, int(s.size()));
        vector <string> rows(n);
        //行增加或减少的状态
        int flag = 1;
        int row = 0;
        for (int i=0; i<s.size(); i++) {
            rows[row].push_back(s[i]);
            row += flag;
            if ((row+1) % n == 0 || row == 0) {
                flag *= -1;
            }
        }
        string res = "";
        for (string ss : rows)
            res += ss;
        return res;
    }
};

