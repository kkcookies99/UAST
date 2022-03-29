 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int len = matrix.size();
        // 环形遍历
        int k = 0;
        if (k >= len / 2) return;
        int i = 0, j = 0, temp = 0, temp2 = 0;
        int dir = 0; // 0 左, 1 下, 2 右, 3 上
        bool has = true;
        vector<int> temp3;
        temp3.resize(len);
        int temp4 = 0;
        while (has) {
            switch (dir)
            {
            case 0:
                temp = matrix[j][len - i - 1];
                matrix[j][len - i - 1] = matrix[i][j];
                temp3[j - k] = temp;
                j++;
                if (j == len - k - 1) {
                    dir = 1;
                }
                break;
            case 1:
                temp = matrix[j][len - i - 1];
                matrix[j][len - i - 1] = temp3[i - k];
                temp3[i - k] = temp;
                i++;
                if (i == len - k - 1) {
                    dir = 2;
                }
                break;
            case 2:
                temp = matrix[j][len - i - 1];
                matrix[j][len - i - 1] = temp3[len - 1 - j - k];
                temp3[len - 1 - j - k] = temp;
                j--;
                if (j == k) {
                    dir = 3;
                }
                break;
            case 3:
                temp = matrix[j][len - i - 1];
                matrix[j][len - i - 1] = temp3[len - 1 - i - k];
                temp3[len - 1 - i - k] = temp;
                i--;
                if (i == k) {
                    k++;
                    if (k < len / 2) {
                        j = k;
                        i = k;
                        dir = 0;
                    }
                    else {
                        has = false;
                    }
                }
                break;
            default:
                break;
            }
        }
    }
};


