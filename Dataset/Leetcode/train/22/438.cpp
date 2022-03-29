 class Solution {
public:
	vector<string> XXX(int n) {
		vector<string>res;
		string temp;
		helperGP(res, temp, 0, 0, n);
		return res;
	}
	void helperGP(vector<string> &res, string &temp, int left, int right, int n)
	{
		if ((int)temp.size()==n*2)
		{
			if (helperJudge(temp))
			{
				if (res.size() == 0)res.push_back(temp);
				else
				{
					res.emplace_back(temp);
				}
			}
			return;
		}
		if (left < n)
		{
			helperGP(res, temp += '(', left + 1, right, n);
			temp.pop_back();
			left--;
		}
		if (right < n)
		{
			helperGP(res, temp += ')', left, right + 1, n);
			temp.pop_back();
			right--;
		}
	}
	bool helperJudge(string temp)
	{
		stack<char>st;
		int i = 0;
		while ( i < (int)temp.size())
		{
			if (temp[i] == '(')
			{
				st.push(temp[i]);
			}
			else
			{
				if (st.size() == 0)
				{
					return false;
				}
				else
				{
					if (st.top() == ')')
					{
						return false;
					}
					st.pop();
				}
			}
			i++;
		}
		if (!st.empty())return false;
		return true;
	}
};

