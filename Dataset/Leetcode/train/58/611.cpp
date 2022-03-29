class Solution {
public:
    int XXX(string s) {
        int len = s.length()-1;
		int count = 0;

		for (int i = len; i >= 0; i--) {
			while (s[i] != ' ') {
				count++; i--;
				if (i<0 || s[i] == ' ')
					return count;
			}
		}

        return 0;
    }
};

