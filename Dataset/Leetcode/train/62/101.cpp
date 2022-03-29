 class Solution {
public:
	int XXX(int m, int n) {
		if (m == 0 || n == 0) {
			return 0;
		}
		vector<int> row(m, 0);
		vector<vector<int>> v(n, row);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == 0 || j == 0) {
					v[i][j] = 1;
				}
				else {
					v[i][j] = v[i - 1][j] + v[i][j - 1];
				}
			}
		}
		return v[n - 1][m - 1];
	}
};

