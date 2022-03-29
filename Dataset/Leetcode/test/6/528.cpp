 class Solution {
public:
    string XXX(string s, int numRows) {
        // 首先每一轮我们基于 一个n行n列的布局来看
        // 观察可得 每一轮除了第一列 剩下列不走首尾两行 且剩下列每一列只有1个
        // 得到一轮用掉的点 公式 n + (n - 2) * 1 n就是行数
        // 然后一轮有多少列呢 1 + n - 2 列
        int n = s.size();
        if (n <= numRows || numRows <= 1) return s; // 特殊情况处理
        int turns = n / (2 * numRows - 2); // 有多少个完整的轮次
        int remainder = n % (2 * numRows - 2); // 余下的点数
        // 余下的点数小于行数只需要一列 否则需要下面的公式
        int col_temp = remainder <= numRows ? 1 : (1 + remainder - numRows);
        int col = turns * (numRows - 1) + col_temp; // 总共需要的列数
        // 开一个 numRows 行 col 列的矩阵
        vector<vector<char>> table(numRows, vector<char>(col, '\0'));
        int i = 0, j = 0;
        int index = 0; // 记录字符串遍历的长度
        while (index < n) {
            // 向下走
            while (i < numRows && index < n) {
                table[i++][j] = s[index++];
            }
            i -= 2;
            j += 1;
            // 向上走
            while (i > 0 && index < n) {
                table[i--][j++] = s[index++];
            }
        }
        // 遍历table 拼接字符
        string res;
        for (int i = 0; i < numRows; ++i) {
            for (int j = 0; j < col; ++j) {
                if (table[i][j] != '\0') res += table[i][j];
            }
        }
        return res;
    }
};

