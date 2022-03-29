 class Solution {
public:
	vector<int> XXX(vector<int>& digits) {
		vector<int>v;
		int dsize = digits.size();
		if (digits[digits.size()-1] != 9)
		{
			digits[digits.size() - 1] += 1;
			return digits;
		}
		else
		{
			if (digits.size() == 1)
			{
				digits.resize(2);
				digits[0] = 1;
				digits[1] = 0;
			}
			else
			{
				int i = digits.size() - 2;
				for (; i >= 0; i--)
				{
					if (digits[i] != 9)
					{
						break;
					}
				}
				if (i < 0)
				{
					digits.resize(dsize + 1);
					digits[0] = 1;
					for (int j = 1; j < digits.size(); j++)
						digits[j] = 0;

				}
				else
				{
					digits[i] += 1;
					for (int k = i + 1; k < digits.size(); k++)
						digits[k] = 0;
				}
				
			}
			return digits;
		}
		
	}
};

