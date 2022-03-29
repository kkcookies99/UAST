 class Solution {
public:
	void XXX(vector<vector<int>>& matrix) {
		int row_num = matrix.size();
		int col_num = row_num;

		int up = 0; int left = 0; int right = col_num - 1; int bot = row_num - 1;
		// 像洋葱一样 逐层旋转 先旋转非四个对角元素 再旋转四个对角
		while (bot - up >=1) {
			
			vector<int> store; // 存储元素
			// 非四个对角元素旋转
			// 将上和右置换
			for (int i = left+1; i <= right-1; i++) {
				store.push_back(matrix[i][right]);
				matrix[i][right] = matrix[up][i];
			}

			// 将右和下置换
			for (int i = right - 1; i >= left + 1; i--) {
				swap(matrix[bot][i], store[(right - 1) - i]);
			}

			// 下和左置换
			for (int i = bot - 1; i >= up + 1; i--) {
				swap(matrix[i][left], store[(bot - 1) - i]);
			}
			// 左和上置换
			for (int i = left + 1; i <= right - 1; i++) {
				swap(matrix[up][i], store[i - (left + 1)]);
			}

			// 四个对角置换
			int tmp = matrix[up][right];
			matrix[up][right] = matrix[up][left];
			swap(tmp, matrix[bot][right]);
			swap(tmp, matrix[bot][left]);
			swap(tmp, matrix[up][left]);

			up++; bot--;
			left++; right--;
		}
		return;
	}
};

