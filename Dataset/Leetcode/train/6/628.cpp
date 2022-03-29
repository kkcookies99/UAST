 class Solution {
public:
    string XXX(string s, int numRows) {
       if (numRows == 1) return s;
		int count = (s.size() < numRows) ? s.size() : numRows;
		int interval = (numRows - 1) * 2;
		string res;
		for (int i = 0;i < count;i++)
		{
			res += s[i];
			for (int j = i;j < s.size()&&interval!=0;j += interval)
			{
				if (i == 0 || i == numRows - 1)
				{
					if (j + interval < s.size())	res+= s[j + interval];
				}
				else
				{
					int otherinterval = interval - i * 2;
					if (j + otherinterval < s.size()) res += s[j + otherinterval];
					if (j + interval < s.size()) res += s[j + interval];
				}
			}
		}
		
		return res;
    }
};

