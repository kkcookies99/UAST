 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows < 2)
        {
            return s;
        }
        string ans;
        int nSize = s.size();
        int nPos = 0;
        int nLimit = 2 * numRows - 2;
        //列数
        int nCol = (nSize + numRows * 2 - 1) / (numRows * 2 - 2);
        for(int i = 0; i<numRows; ++i)
        {
            for(int j = 0; j < nCol; ++j)
            {
                nPos = j * nLimit + i ;
                if(nPos < nSize)
                {
                    ans += s[nPos];
                    int Res = nLimit - nPos % nLimit;
                    if(Res != nLimit && Res != nLimit / 2 && nLimit - i * 2 + nPos < nSize)
                    {
                        ans += s[nLimit - i * 2 + nPos];
                    } 
                }
                else
                {
                    break;
                }
            }
        }
        return ans;
    }
};

