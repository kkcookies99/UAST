int XXX(string str) {
	int ret = 0;
	bool isminus = false;
	while (!str.empty() && str[0] == ' ')
		str.erase(str.begin());
	if (str[0] == '-'){
		isminus = true;
		str.erase(str.begin());
	}
    else if(str[0]=='+')str.erase(str.begin());
	if(str[0]<='9'&&str[0]>='0'){
		for (int i = 0; i != str.length(); i++) {
			int a = str[i] - '0';
			if (a > 9 || a < 0)return ret;
			if (isminus) {
				if ((ret < INT_MIN / 10) || (ret == INT_MIN / 10 && -a < INT_MIN % 10)) return INT_MIN;
				ret *= 10; ret -= a; continue;
			}
			if ((ret > INT_MAX / 10) || (ret == INT_MAX / 10 && a > INT_MAX % 10)) return INT_MAX;
			ret *= 10; ret += a;
		}
	}
	else return 0;
	return ret;
}

