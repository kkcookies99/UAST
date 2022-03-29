 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows == 1 || numRows > s.size())
            return s;
        string s_ret;
        int len = s.size();
        int intervel_sum = 2 * (numRows - 1);
        for(int row = 0; row != numRows; ++row)
        {
            int ele_row_num = 0;
            int interval_1(0), interval_2(0);
            if(row == 0 || row == numRows - 1)
            {   
                ele_row_num = (len - row - 1) / (intervel_sum) + 1;
                for(int i = 0; i != ele_row_num; ++i)
                    s_ret.push_back(s[row + i * intervel_sum]);
            }
            else
            {
                int interval_1 = 2 * (numRows - row - 1);
                int interval_2 = intervel_sum - interval_1;
                if((len - row - 1) % intervel_sum >= interval_1)
                    ele_row_num = ((len - row - 1) / (intervel_sum)) * 2 + 2;
                else
                    ele_row_num = ((len - row - 1) / (intervel_sum)) * 2 + 1;
                for(int i = 0; i != ele_row_num; ++i)
                {
                    if(i % 2 == 0)
                        s_ret.push_back(s[row + i / 2 * intervel_sum]);
                    else
                        s_ret.push_back(s[(row +  (i - 1) / 2 * intervel_sum + interval_1)]);
                }
            }
        }
        return s_ret;
    }
};

