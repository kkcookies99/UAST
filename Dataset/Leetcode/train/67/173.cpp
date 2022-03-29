 class Solution {
public:
    string XXX(string a, string b) {
	int len_a = a.length(),
		len_b = b.length();

	if (len_a == 0)
		return b;
	if (len_b == 0)
		return a;

	int carry = 0,
		max_len = std::max(len_a, len_b);
	char tmp_a = '0', tmp_b = '0';
		
	std::string res = "";

	while (max_len != 0) 
	{
		--max_len;
		
		if (len_a > 0) 
		{
			tmp_a = a.at(len_a - 1);
		}
		else if (len_a <= 0) 
		{
			tmp_a = '0';
		}

		if (len_b > 0) 
		{
			tmp_b = b.at(len_b - 1);
		}
		if (len_b <= 0) 
		{
			tmp_b = '0';
		}
		--len_a;
		--len_b;

		if ((tmp_a == '0') && (tmp_b == '0')) 
		{
			if (carry == 0) 
			{
				res.push_back('0');
			}
			else if (1 == carry) 
			{
				res.push_back('1');
			}
			carry = 0;
		}
		else if (((tmp_a == '0') && (tmp_b == '1')) 
			|| ((tmp_a == '1') && (tmp_b == '0'))) 
		{
			if (carry == 0)
			{
				carry = 0;
				res.push_back('1');
			}
			else if (1 == carry)
			{
				carry = 1;
				res.push_back('0');
			}
		}
		else if ((tmp_a == '1') && (tmp_b == '1'))
		{
			if (carry == 0)
			{
				res.push_back('0');
			}
			else if (1 == carry)
			{
				res.push_back('1');
			}

			carry = 1;
		}
	}

	if (carry == 1) 
	{
		res.push_back('1');
	}
	std::reverse(res.begin(), res.end());

	return res;
    }
};

