class Solution {
public:
void XXX(vector<vector<int>>& matrix) {
    int n = matrix.size();
    for (int i = 0; i < n/2; i++) { // 外层循环n/2次
        for (int j = i; j < n-i-1; j++) { // 对第i层，循环 n-1-i 次
            int x = i;
            int y = j;
            int count = 4;
            int buf = matrix[x][y];
            while (count) { // 每次循环进行4次元素交换
                int tmp = matrix[y][n - 1 - x];
                matrix[y][n - 1 - x] = buf;
                buf = tmp;
                int t = x;
                x = y;
                y = n - 1 - t;
                count--;
            }
        }
    }
}
};

