 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        	vector<vector<int>> res(numRows, vector<int>());

	for (int i = 0; i < numRows; i++) {
		res[i].resize(i + 1);  //确定每行数字的个数
		res[i][0] = 1;
		res[i][i] = 1;
	}

	if (numRows > 2) {
		for (int i = 2; i < numRows; i++) {
			for (int j = 1; j < res[i].size()-1; j++) {
				res[i][j] = res[i - 1][j] + res[i - 1][j - 1];
			}
		}
	}

	return res;
    }
};

