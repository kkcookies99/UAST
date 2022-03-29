 class Solution {
public:
    //模拟法，numRows有多少，就开多少行数组存储
    string XXX(string s, int numRows) {
        if(numRows == 1) //特判
            return s;
        vector<vector<char>> str(numRows);
        int i = 0;
        while(i < s.size())
        {
            //先从上到下存
            for(int j = 0; j < numRows; j++)
            {
                if(i < s.size())
                    str[j].push_back(s[i++]);
                else
                    break;
            }
            //在从下往上存
            for(int j = numRows - 2; j > 0; j--)
            {
                if(i < s.size())
                    str[j].push_back(s[i++]);
                else
                    break;
            }     

        }
        string res = "";
        for(auto st : str)
        {
            for(auto r : st)
                res += r;
        }
        return res;
    }
};

