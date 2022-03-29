 class Solution {
public:
    string XXX(string s, int numRows) {
        if(s.length() <= numRows || numRows == 1)
            return s;
        vector<vector<string>> temp;
        int flag = 0; // 判斷  N 柱
        int flag_mid = -1;  // 判斷 N 斜
        vector<string>col;
        string res;
        for(int i = 0; i < s.length(); ++i)
        {
            if(flag == numRows)
            {
                // 掛起
                flag = -1;
                flag_mid = 0;
                temp.push_back(col);
                col.clear();
            }
            if(flag_mid == numRows - 2)
            {
                // 掛起
                flag = 0;
                flag_mid = -1;
            }
            if(flag >= 0 && flag < numRows)
            {
                string appendS;
                appendS.append(1, s[i]);
                col.push_back(appendS);
                flag += 1;
                // 結尾  且  處理柱子未滿
                if(i == s.length() - 1)
                {
                    while(col.size() != numRows)
                        col.push_back("");
                    temp.push_back(col);
                }
            }
            
            if(flag_mid >=0 && flag_mid < numRows - 2)
            {
                for(int j = 0; j < numRows; ++j)
                {
                    if(j == numRows - flag_mid - 2)
                    {
                        string appendS;
                        appendS.append(1, s[i]);
                        col.push_back(appendS);
                    }
                    else
                        col.push_back("");
                }
                temp.push_back(col);
                col.clear();
                flag_mid += 1;
            }
        }
        for(int i = 0; i < temp[0].size(); ++i)
            for(int j = 0; j < temp.size(); ++j)
                res += temp[j][i];
        return res;
    }
};

