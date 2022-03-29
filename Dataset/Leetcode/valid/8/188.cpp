class Solution {
public:
	int XXX(string str) {
		double sum = 0;
		int isNegative = 0;
		int i = -1;
		int flag = 0;
		while (1)
		{
			i++;
			if (flag == 0 && str[i] == ' ')
				continue;
			if (flag == 0 && str[i] == '+')
			{
				flag = 1;
				continue;
			}
			if (flag == 0 && str[i] == '-')
			{
				isNegative = 1;
				flag = 1;
				continue;
			}
			if (str[i]>='0' && str[i]<='9')
			{	
				flag = 1;
				sum *= 10;
				sum += (str[i] - 48);
			}
			else
				break;
		}
		if (isNegative == 1)
		{
			sum *= -1;
		}
		if (sum>INT_MAX)
		{
			return INT_MAX;
		}
		if (sum<INT_MIN)
		{
			return INT_MIN;
		}
		return sum;
	}
};