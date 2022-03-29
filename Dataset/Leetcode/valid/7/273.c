int XXX(int x) {
	int a[32] = { 0 }; int t; int i = 0; 
		while (x != 0) {
			t = x % 10;
			a[i] = t;
			x = x / 10;
			i++;
		}
		long y = 0; int g = i;
		for (int k = 0; k < g; ++k) {
			i--;
			if (i > 0)
				y += a[k] * pow(10, i);
			else
				y += a[k];
		}
		if (y > 0x7fffffff || y < (signed int)0x80000000)return 0;
		else return y;
}

