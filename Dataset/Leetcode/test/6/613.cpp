 class Solution {
public:
    string XXX(string s, int numRows) {
        if(s.size() <= numRows)
            return s;
        if(numRows <= 1)
            return s;
        int count = 0;
        vector<int> starts;
        string res = "";
        for(int i = 0;i<numRows;i++)
            starts.push_back(i);
        while(count < numRows)
        {
            if(count == 0)
            {
                if(starts[0] < s.size())
                {
                    res = res + s[starts[0]];
                    starts[0] = starts[0] + 2*(numRows-1);
                }
                else
                    count++;
            }
            else if(count == numRows-1)
            {
                if(starts[numRows-1] < s.size())
                {
                    res = res + s[starts[numRows-1]];
                    starts[numRows-1] = starts[numRows-1]+2*(numRows-1);
                }
                else
                    count++;
            }
            else
            {
                if(starts[count] < s.size())
                {
                    res = res + s[starts[count]];
                    if(starts[count]+2*(numRows-1)-2*count<s.size())
                        res = res + s[starts[count]+2*(numRows-1)-2*count];
                    starts[count] = starts[count] + 2*(numRows-1);
                }
                else
                    count++;                 
            }
        }
        return res;
    }
};

