 class Solution {
public:
    string XXX(string s, int numRows)
    {
        int total = 2 * numRows - 2;
        string res;
        if (numRows == 1) return s;
        for (int row = 0; row < numRows; row++) {
            int gaps[2] = {total - 2 * row, 2 * row};
            int i = row;
            int gapIndex = 0;
            int charIndex = i;
            while(charIndex < s.size()) {
                res.push_back(s[charIndex]);
                if (gaps[gapIndex] == 0) {
                    gapIndex = (gapIndex + 1) % 2;
                }
                charIndex = charIndex + gaps[gapIndex];
                gapIndex = (gapIndex + 1) % 2;
            }
        }
        return res;
    };
};


