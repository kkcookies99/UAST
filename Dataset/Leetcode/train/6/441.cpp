 class Solution {
public:
    // 计算下一个位置
    int calue_nexti(int n, int i, int index, int flag) {
        if (flag == 1) {
            if (n-1-i==0) return index + 2 *(n - 1);
            return 2 * (n - i - 1) + index;
        } else if (flag == 2) {
            return 2 * i + index;
        } 
        return 0;
    }

    string XXX(string s, int numRows) {
        if (numRows == 1) return s;
        string result = "";
        int flag = 0;
        for (int i = 0; i < numRows; i++) {
            int j = i;
            while (j < s.size()) {
                result += s[j];
                int t = j % (2 * (numRows - 1)) ;
                if (t < numRows) {
                    flag = 1;
                } else if (t < 2 * (numRows - 1)){
                    flag = 2;
                }
                // printf("%d: %d\t%d\t%d\t%d\n", t, numRows, i, j, flag);
                j = calue_nexti(numRows, i, j, flag);
            }
        }
        return result;
    }
};

