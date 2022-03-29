 class Solution {
public:
    string XXX(string s, int nRows) {
        if (nRows == 1 || nRows >= s.size()) {
            return s;
        }
        
        string str;
        int edge = nRows - 1;
        for (int i = 0; i < nRows; ++i)  {
            int k = i;
            while (k < s.size())  {
                str += s[k];
                if (i == 0 || i == edge) {
                    k += 2 * edge;
                } else {
                    k += 2 * (edge - (k % edge));
                }
            }
        }
        return str;
    }
};

