 class Solution {
public:
    string XXX(string s, int numRows) {
        vector<vector<char>> matrix;
        int col=0;
        int i=0;
        
        if (numRows==1)
        {
            return s;
        }
        while(true)
        {
            int colperiod = col%(numRows-1);
            vector<char> colvalue;

            if (colperiod == 0)
            {
                for (int row=0;row<numRows;row++)
                {
                    if(i<s.size())
                    {
                        colvalue.push_back(s[i]);
                        i++;
                    }
                    else
                    {
                        colvalue.push_back(0);
                    }
                }
            }
            else
            {
                for (int row=0;row<numRows;row++)
                {
                    if (row!=numRows-1-colperiod)
                    {
                        colvalue.push_back(0);
                    }
                    else
                    {
                        colvalue.push_back(s[i]);
                        i++;
                    }
                }

            }
            col++;
            matrix.push_back(colvalue);
            if (i>=s.size())
            {break;}
        }

        string output;
        for (int i=0;i<numRows;i++)
        {
            for (int j=0;j<col;j++)
            {
                if (matrix[j][i]!='0')
                {
                    output+=string(1,matrix[j][i]);
                }
            }
        }
        // output.push_back('\0');
        return output;

    }
};

