class Solution {
public:
     int XXX(int n) {
	if (n == 1) return 1;
	if (n == 2) return 2;

	int s1 = 1, s2 = 2;
	for (int i = 3; i <= n; i++)
	{
	   s2 = s1 + s2;
	   s1 = s2 - s1;
	}
	return s2;
    }
};

