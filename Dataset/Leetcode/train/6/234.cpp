 class Solution {
public:
    string XXX(string s, int numRows) {
        if (numRows == 1) return s;
        vector<string> vec(numRows);
        int flag = 1;
        int i = 0, idx = 0;
        while (i < s.size()) {
            vec[idx] += s[i];
            idx += flag;
            if(idx == numRows) {
                idx = numRows - 2;
                flag = -1;
            } else if(idx == -1) {
                idx = 1;
                flag = 1;
            }
            i++;
        }
        string res;
        for (auto& i : vec) {
            res += i;
        }
        return res;
    }
};


