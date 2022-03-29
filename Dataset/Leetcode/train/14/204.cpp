 class Solution {
public:
	string XXX(vector<string>& strs) {
		int size = strs.size();
		if (size == 0)
		{
			return "";	
		}
		int min_str_len = strs[0].size();
		string temp;
		char tstr;
		for (size_t i = 1; i < size; i++)
		{
			min_str_len = strs[0].size() < min_str_len ? strs[0].size() : min_str_len;
		}
		for (size_t j = 0; j < min_str_len; j++)
		{
			tstr = strs[0][j];
			for (size_t i = 1; i < size; i++)
			{
				if (tstr != strs[i][j])
				{
					return temp;
				}
			}
			temp += tstr;
		}
		return temp;
	}
};

