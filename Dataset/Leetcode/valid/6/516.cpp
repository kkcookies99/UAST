 class Solution {
public:
    string XXX(string s, int numRows) {
        if (numRows >= s.size() || numRows == 1) return s;
        vector<string> sNew(numRows);
        bool goingDown = false;
        int row = 0;
        for (char c : s) {
            sNew[row] += c;
            if (row == 0 || row == numRows - 1) {
                goingDown = !goingDown;
            } // if
            row = goingDown ? (row + 1) : (row - 1); 
        } // for c
        string ret;
        for (string i : sNew) {
            ret += i;
        } // for
        return ret;
    }
};

