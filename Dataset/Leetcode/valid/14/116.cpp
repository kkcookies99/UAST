 class Solution {
public:
	string XXX(vector<string>& strs) {
		if (strs.empty() || strs[0].empty())
			return "";
		if (strs.size() == 1)
			return strs[0];
		string result = "";
		for (int i = 0; i < strs[0].length(); i++)
		{
			for (int j = 1; j < strs.size(); j++)
			{
				if (strs[0][i] != strs[j][i]) {
					return result;
				}
			}
			result += strs[0][i];
		}
		return result;
	}
};

