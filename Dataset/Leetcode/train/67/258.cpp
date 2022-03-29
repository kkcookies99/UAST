 class Solution {
public:
    string XXX(string a, string b) {
		int lena = a.length();
		int lenb = b.length();
		if(lena>lenb)   for(int i = 0; i < (lena-lenb); i++) b.insert(b.begin(), '0');
		else            for(int i = 0; i < (lenb-lena); i++) a.insert(a.begin(), '0');
		string res;
		int len = a.length();
		bool flag = false;
		for(int i = len-1; i >= 0; i--) {
			char c_a = a.at(i);
			char c_b = b.at(i);
			if(c_a != c_b) {
				if(flag) {
					flag = true;
					res.insert(res.begin(), '0');
				}
				else res.insert(res.begin(), '1');
			} else {
				if(c_a == '0') {
					if(flag) {
						flag = false;
						res.insert(res.begin(), '1');
					}
					else res.insert(res.begin(), '0');
				} else {
					if(flag) res.insert(res.begin(), '1');
					else res.insert(res.begin(), '0');
					flag = true;
				}
			}
		}
		if(flag) res.insert(res.begin(), '1');
		return res;
    }
};

