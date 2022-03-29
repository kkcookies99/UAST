 class Solution {
public:
    string XXX(string s, int numRows) {
        if (numRows < 2)
	    return s;
	string res(int(s.length()),' ');
	int step = 2 * numRows - 2;
	int count = 0;
	for (int i = 0; i < numRows; i++)
	{
            int index = i;
	    int step_add = i * 2;
	    while (index < s.length())
	    { 
                 res[count++] = s[index];
		 step_add = step - step_add;
		 index += step_add == 0 ? step : step_add;
	    }
	}
        return res;
    }
};
