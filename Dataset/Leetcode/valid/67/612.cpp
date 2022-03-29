class Solution {
public:
    string XXX(string a, string b) {
        string res;
    int m = max(a.length(), b.length());
	int n = min(a.length(), b.length());
	reverse(a.begin(), a.end());
	reverse(b.begin(), b.end());
	res = a.length() > b.length() ? a : b;
	int sum = 0;
	for (int i = 0; i <m; i++)
	{
		if (i < n)
		{
			sum += (a[i] + b[i] - '0' - '0');
			if (sum >= 2)
			{
                if(sum>2)
				res[i] = '1';
				else
                res[i] = '0';
                sum = 1;
			}
			else
			{
				res[i] = sum+'0';
				sum = 0;
				
			}
		}
		else
		{
			sum += (res[i]-'0');
			
			if (sum >= 2)
			{
				 if(sum>2)
				res[i] = '1';
				else
                res[i] = '0';
                sum = 1;
			}
			else
			{
				res[i] = sum + '0';
				sum = 0;				
			}
		}
	}	
	if (sum == 1)
		res += '1';
	reverse(res.begin(), res.end());
    return res;
}
};


