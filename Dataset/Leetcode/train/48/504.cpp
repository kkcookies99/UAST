 class Solution {
public:
	void XXX(vector<vector<int>>& matrix) {
		if (matrix.size() == 0) {
			return;
		}
		else
		{
			int n = matrix.size();
			//int m = matrix[0].size();
			vector<vector<int>> a(matrix.begin(),matrix.end());
			for (int i = 0; i < n; i++) {
				for (int j = 0, k = n-1; j <n, k >= 0; j++, k--) {
					matrix[i][j] = a[k][i];// j=0 k=2 j=1 k=1 j=2 k=0
				}
			}
		}
	
	}
};

