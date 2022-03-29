class Solution {
public:
    int XXX(int m, int n) {
        std::vector<std::vector<int>> map(m);
	    for (int i = 0; i < m; ++i) {
		map[i].resize(n);
	    }
	    for (int i = 0; i < m; ++i) {
		    for (int j = 0; j < n; ++j) {
			if (i == 0 || j == 0) {
				map[i][j] = 1;
			}
			else {
				map[i][j] = map[i - 1][j] + map[i][j - 1];
			}
		}
	}
	return map[m - 1][n - 1];
    }
};

