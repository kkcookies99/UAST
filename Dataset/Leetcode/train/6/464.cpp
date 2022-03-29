 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows == 1)
            return s;

        vector<string> vs(numRows);
        bool upFlag = true;
        for (int i=0, j=0; i < s.size(); ++i)
        {
            vs[j].push_back(s[i]);
            j = upFlag? j+1: j-1;
            upFlag = (j==0 || j==numRows-1)? !upFlag: upFlag;
        }// 如果row是4，则j的值为0 1 2 3 2 1 0 1 2 3
        string res;
        for (const auto& x: vs)
            res += x;
        return res;
    }
};

