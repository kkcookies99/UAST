 class Solution {
public:

    string discConvert(string& str) {
	int n = str.length();
	if (n == 0) return "";
	string tmp = "";
	for (int i = 0; i < n; ++i) {
		int start = i;
		while (i +1 < n && str[i+1] == str[i ]) {
			++i;
		}
		tmp += to_string(i + 1 - start);
		tmp += str[i];
	}
	return tmp;
}

    string XXX(int n) {
        if(n == 1) return "1";
        string str = XXX(n-1);
        return discConvert(str);
    }
};

