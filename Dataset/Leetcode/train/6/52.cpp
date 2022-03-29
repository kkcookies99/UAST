 class Solution {
public:
    string XXX(string s, int numRows) {
        int n = s.size();
        string ss;
        int sum = 0;
        int h = 1;
        if (numRows == 1)
        {
            return s;
        }
        else
        {
            while (sum < n)
            {
                for (int i = h - 1; i < n; i += (h - 1) * 2)
                {
                    ss.push_back(s[i]);
                    sum++;
                    i += (numRows - h) * 2;
                    if ((h - 1) * 2 != 0 && (numRows - h) * 2 != 0 && i < n)
                    {
                        ss.push_back(s[i]);
                        sum++;
                    }
                }
                h++;
            }
        }
        return ss;
    }
};

