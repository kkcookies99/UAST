class Solution {
public:
    int XXX(string s) {
            int pos=s.size()-1;
		bool flag = true;
		int sum = 0;
		while (pos >=0)
		{
				if (s[pos] != ' ')
				{
					flag = false;
					sum++;
				}
				else
				{
					if (!flag)
					{
						break;
					}
				}
				pos--;
		}
		return sum;
    }
};

