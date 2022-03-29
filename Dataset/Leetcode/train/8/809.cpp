 class Solution {
public:
    int XXX(string str) {
		int temp=0,flag=1,ans=0,i=0,j=0;
	for (i = 0; i < str.length(); i++)
		if (str[i] != ' ')
			break;
	for (j=i; j < str.length(); j++)
	{
		if (!(str[j] >= '0'&&str[j] <= '9')) {
			if (str[j] == '-'||str[j] == '+') {
				if (j!=i)
					break;
			}
			else
				break;
		}
		switch (str[j])
		{
		case '0':
			temp = temp * 10 + 0; break;
		case '1':
			temp = temp * 10 + 1; break;
		case '2':
			temp = temp * 10 + 2; break;
		case '3':
			temp = temp * 10 + 3; break;
		case '4':
			temp = temp * 10 + 4; break;
		case '5':
			temp = temp * 10 + 5; break;
		case '6':
			temp = temp * 10 + 6; break;
		case '7':
			temp = temp * 10 + 7; break;
		case '8':
			temp = temp * 10 + 8; break;
		case '9':
			temp = temp * 10 + 9; break;
		case '-':
			flag = 0; break;
		default:
			break;
		}
		if (temp / 10 != ans)
		{
			if (flag)
				ans = INT32_MAX;
			else
				ans = INT32_MIN;
		}
		else
			ans = temp;
	}
	if (!flag)
		ans = -ans;
    return ans;    
    }
};

