class Solution {
public:
	string XXX(string a, string b) 
	{
		int size_a = a.size(),size_b=b.size();
		char temp = '0',temp1='0';
		int max = size_a > size_b ? size_a : size_b;
		int k = max + 1;
		vector<char> s(k,' ');
		string c = "";
		while (size_a--&&size_b--)
		{
			temp = a[size_a] + b[size_b]-'0'+temp1-'0';
			if (temp >= '2')
			{
				temp = temp - '2'+'0';
				temp1 = '1';
			}
			else
			{
				temp1 = '0';
			}
			if (k >= 1)
			{
				s[--k] = temp;
			}
		}
		size_a++;
		if (a.size() > b.size())
		{
			size_b++;
		}
		if (temp1 == '1')
		{
			//a短，或a b一样长
			if (size_a==0)
			{
				if (size_b > 0)
				{
					while (size_b--)
					{
						temp = b[size_b] + temp1-'0';

						if (temp >= '2')
						{
							temp = temp - '2'+'0';
							temp1 = '1';
						}
						else
						{
							temp1 = '0';
						}
						if (k >= 1)
						{
							s[--k] = temp;
						}
					}
					if (temp1 == '1')
					{
						if (k >= 1)
							s[--k] = temp1;
					}
				}
				else
				{
					if (k >= 1)
						s[--k] = temp1;
				}
			}
			else
			{
				if (size_a > 0)
				{
					while (size_a--)
					{
						temp = a[size_a] + temp1-'0';

						if (temp >= '2')
						{
							temp = temp - '2'+'0';
							temp1 = '1';
						}
						else
						{
							temp1 = '0';
						}
						if (k >= 1)
						{
							s[--k] = temp;
						}
					}
					if (temp1 == '1')
					{
						if (k >= 1)
							s[--k] = temp1;
					}
				}
				else
				{
					if(k>=1)
						s[--k] = temp1;
				}
			}
		}
		else
		{
			if (size_b > 0)
			{
				while (size_b)
				{
					s[--k] = b[--size_b];
				}
			}
			if (size_a > 0)
			{
				while (size_a)
				{
					s[--k] = a[--size_a];
				}
			}
		}
		string temp2 = "";
		for (int i = 0;i < s.size();i++)
		{
			if (s[i] != ' ')
			{
				temp2 = s[i];
				c += temp2;
			}
		}
		return c;
	}
};

