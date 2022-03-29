 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
	vector<vector<int>> XXX;
	XXX.resize(numRows);
	for (int i = 0; i < numRows; i++)
	{
		XXX[i].resize(i + 1);
		XXX[i][0] = 1;
		XXX[i][i] = 1;
		for (int j = 1; j < i; j++)
		{
			XXX[i][j] = XXX[i - 1][j - 1] + XXX[i - 1][j];
		}
	}
        return XXX;
        
    }
};

