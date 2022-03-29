class Solution {
public:
    int XXX(string s) {
        int rev = 0;
	char c = ' ';
	for (int i = s.length() - 1; i >= 0; i--) {
		if (s[i] != c) {
			rev += 1;
		}
		else if (rev != 0)
		{
			return rev;
		}
	}
	return rev;
    }
};

