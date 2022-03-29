class Solution {
public:
    int XXX(string s) {
		int len = 0;
        for(int i = 0; i < s.length(); i++) {
			if(s[i] > 32) len++;
			else if(i < s.length() && s[i+1] > 32) len = 0;
		}
		return len;
    }
};

