 class Solution {
public:
    string XXX(string s, int numRows) {
        int length = s.size();
        string ans = "";

        if (length < numRows || numRows < 2) return s;

        int curPtr = 0;
        //第一行处理
        while (curPtr < length) {
            ans += s[curPtr];
            curPtr += 2 * numRows - 2;
        }
        //中间行处理，有竖列和斜列两种属性，分别存储为firstN和secondN
        for (int row = 1; row < numRows - 1; ++row) {
            int firstN = row;
            int secondN = (numRows - row - 1) * 2 + firstN;
            if (firstN < length) {
                ans += s[firstN];
            }
            else {
                continue;
            }
            if (secondN < length) {
                ans += s[secondN];
            }
            else {
                continue;
            }
            
            firstN += 2 * numRows - 2;
            secondN += 2 * numRows - 2;
            while (firstN < length) {
                ans += s[firstN];
                if (secondN < length) ans += s[secondN];
                firstN += 2 * numRows - 2;
                secondN += 2 * numRows - 2;
            }
        }
        //处理最后一行
        curPtr = numRows - 1;
        while (curPtr < length) {
            ans += s[curPtr];
            curPtr += 2 * numRows - 2;
        }

        return ans;
    }
};
