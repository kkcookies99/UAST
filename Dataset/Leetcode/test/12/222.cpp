 class Solution {
public:
    string XXX(int num) {
	string b = { 'I','V','X','L','C','D','M' };
	string d[4],con;
	int a[4] = { 0 };
	a[0] = num / 1000;
	a[1] = num / 100 % 10;
	a[2] = num / 10 % 10;
	a[3] = num % 10;
	int k = 0;
	for (int i = 3; i >= 0; i--)//位数循环
	{
		for (int j = k; j < 8; )//字母循环
		{
			switch (a[i])
			{
			case 1: d[i] = b[j]; break;
			case 2: d[i] = b[j]; d[i] += b[j]; break;
			case 3: d[i] = b[j]; d[i] += b[j]; d[i] += b[j]; break;
			case 4: d[i] = b[j]; d[i] += b[j + 1]; break;
			case 5: d[i] = b[j + 1];  break;
			case 6: d[i] = b[j + 1]; d[i] += b[j]; break;
			case 7: d[i] = b[j + 1]; d[i] += b[j]; d[i] += b[j]; break;
			case 8: d[i] = b[j + 1]; d[i] += b[j]; d[i] += b[j]; d[i] += b[j]; break;
			case 9: d[i] = b[j]; d[i] += b[j + 2]; break;
			}
			k += 2;
			break;
		}
	}
	for (int i = 0; i < 4; i++)
	{
		con += d[i];
	}
    return con;
    }
};

