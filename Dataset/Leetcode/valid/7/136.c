int XXX(int x) {
    long long res = 0;
	do {
		res = res*10 + x % 10;
		x = x / 10;	
	}
	while (x != 0);
	if (res > INT_MAX || res<INT_MIN) 
		return 0;
	else
	return (int)res;
}

