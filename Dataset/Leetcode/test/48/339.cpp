class Solution {
public:
	void XXX(vector<vector<int>>& matrix) {
		int m = matrix.size();
		int n = matrix[0].size();
		for (int i = 0; i < m / 2; i++)
		{
			int row = i, column = i;
			for (int j = column, k = 0; j < n -1- i; j++, k++)
			{
				swap(matrix[row][j], matrix[row+k][n - 1 - column]);
				swap(matrix[row][j], matrix[m - 1 - row][n - 1 - column-k]);
				swap(matrix[row][j], matrix[m - 1 - row-k][column]);
			}
		}
	}


	void swap(int &num1, int &num2)
	{
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}
};
undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


