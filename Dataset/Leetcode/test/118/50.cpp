 class Solution {
public:
	vector<vector<int>> res = {{1}};
	vector<vector<int>> XXX(int numRows) {
        if(numRows==0)return {};
		for (int i = 1; i < numRows; i++) {
			vector<int> temp;
			temp.push_back(1);
			for (int j = 1; j < i; j++) {
				temp.push_back(res[i - 1][i - j - 1] + res[i - 1][i - j]);
			}
			temp.push_back(1);
			res.push_back(temp);
		}
		return res;
	}
};

