class Solution {
public:
int dfs(short int row,short int col,char sum, vector<vector<int>>& matrix)
{
	if (sum == 3)
	{
		int temp= matrix[row][col];
		matrix[row][col] = matrix[matrix.size() - 1-col][row];
		return temp;
	}
	int temp = matrix[row][col];	
	matrix[row][col] = dfs(matrix.size() - 1-col, row, sum+1,matrix);
	return temp;
}
    void XXX(vector<vector<int>>& matrix) {
	for (int i = 0; i < (matrix.size() % 2 ? matrix.size() / 2 + 1 : matrix.size() / 2); i++)
		for (int j = 0; j < matrix.size() / 2 ; j++)
			dfs(i, j, 0, matrix);
    }
};

