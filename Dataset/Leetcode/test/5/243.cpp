 class Solution {
public:
	string XXX(string s) {
		if (s == "")
		{
			return s;
		}
		string temp;
		int size = s.size();
		for (int len = size; len > 0; len--)
		{	
			for (int i = 0; i <= size - len; i++)
			{
				// 不加这个限制条件会超时
				if (s[i] != s[len + i - 1])
				{
					continue; 
				}
				temp = s.substr(i, len);
				string revtemp = temp;
				reverse(revtemp.begin(), revtemp.end());
				if (temp == revtemp)
				{
					return temp;
				}
			}
		}
		return "";
	}
};

