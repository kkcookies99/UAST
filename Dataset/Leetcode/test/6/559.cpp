 class Solution {
public:
    string XXX(string s, int numRows) {
        if (numRows == 1|| numRows >= s.size())
            return s;
        vector<string> ans(numRows, "");    //存储每行字符
        size_t flg{ }, max = 2 * numRows - 3;   //定义辅助变量与最大的变量
        //显然地，返回的字符串的元素号应该是0,1,2,...,numRows-1,numRows-2,...,max,0,1,2,...
        for (const auto& i : s)
        {
            ans[flg < numRows - 1 ? flg : max + 1 - flg] += i;
            if (flg++ == max)
                flg = 0;
        }
        s = "";
        for (const auto& i : ans)
            s += i;
        return s;
    }
};

