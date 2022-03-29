class Solution {
public:
	int XXX(string str) {
		double ret = 0;
		int num = 0;
		bool setFlag = false;
		bool setBlankspace = false;
		int multiFlag = 1;
		for(int i = 0; i < str.size(); i++)
		{
			if(str[i] == ' ')
			{
				if(setBlankspace)
				{
					break;
				}
				else
				{
					continue;
				}
			}
			if(str[i] < '0' || str[i] > '9')
			{
				if((str[i] == '-' || str[i] == '+') && !setFlag)
				{
					setFlag = true;
					setBlankspace = true;
					if(str[i] == '-')
					{
						multiFlag = -1;
					}
					continue;
				}
				else
				{
					break;
				}
			}
			setFlag = true;
			setBlankspace = true;
			num = str[i] - '0';
			ret *= 10;
			ret += num;
		}
		ret *= multiFlag;
		if(ret > INT_MAX)
		{
			return INT_MAX;
		}
		else if(ret < INT_MIN)
		{
			return INT_MIN;
		}
		else
		{
			return ret;
		}
	}
};

