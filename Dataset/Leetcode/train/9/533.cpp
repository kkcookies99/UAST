 class Solution {
public:
	bool XXX(int x) {
		if (x < 0)
			return false;
		int y = 0;
		int s = x;
		while (s > 0)
		{
			if (y > INT_MAX / 10)
				return false;
			y = y * 10 + s % 10;
			s = s / 10;
		}
		if (x == y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
};

