 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows == 1)
            return s;
        vector<string> record(numRows);
        string res;
        int flag = 1,i = 0;
        for(char c : s)
        {
            record[i] += c;
            i += flag;
            if(i == 0 || i == numRows-1)
                flag = -flag;
        }
        for(auto &a : record)
            res += a;
        return res;
    }
};

