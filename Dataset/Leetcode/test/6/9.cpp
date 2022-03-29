 class Solution
{
public:
    string XXX(string s, int numRows)
    {
        if (numRows == 1)
            return s;
        vector<string> array(numRows);
        int row = 0, col = 0;
        for (auto &c : s)
        {
            array[row].push_back(c);
            if (col % (numRows - 1) == 0 && row != numRows - 1)
                row++;
            else
            {
                row--;
                col++;
            }
        }
        string ans;
        for (auto &c : array)
            ans += c;
        return ans;
    }
};

