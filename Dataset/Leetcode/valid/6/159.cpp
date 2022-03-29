 class Solution {
public:
    string XXX(string s, int numRows) {
        string result = "";
        if(numRows == 1 || s.size() <= numRows) return s;
        for(int i = 0;i < numRows;i++)
        {
            int start = i;
            int step;
            if((i == numRows-1) or (i == 0))
            {
                step = 2 * (numRows - 1);
                while(start < s.size())
                {
                result += s[start];
                start += step;
                }
            }
            else
            {
                step = 2 * (numRows -1 -i);
                while(start < s.size())
                {
                result += s[start];
                start += step;
                step = 2* numRows -step-2;
                }
            }
            
        }

        return result;
    }
};

