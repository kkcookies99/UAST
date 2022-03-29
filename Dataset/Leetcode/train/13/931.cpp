 class Solution {
public:
    int XXX(string s) {
        string roma;
	roma=s;
	int sum = 0;
	int length = roma.length(),i;
	for (i = 0; i < length; i++)
	{
		if ((roma[i] == 'I' && roma[i + 1] != 'I') && i != length - 1)
			sum--;
		else if ((roma[i] == 'X' && (roma[i + 1] != 'I'&&roma[i + 1] != 'V'&&roma[i + 1] != 'X')) && i != length - 1)
			sum -= 10;
		else if ((roma[i] == 'C' && ( roma[i + 1] == 'D'|| roma[i + 1] == 'M') )&& i != length - 1)
			sum -= 100;
		else
		{
			switch (roma[i])
			{
			case'I':sum += 1; break;
			case'X':sum += 10; break;
			case'V':sum += 5; break;
			case'L':sum += 50; break;
			case'C':sum+=100; break;
			case'D':sum += 500; break;
			case'M':sum += 1000; break;
			}
		}

			
	}
     return sum;
    }
};

