int XXX(int x)
{
	long n = 0;
	while (x)
	{
		n = n * 10 + x % 10;
		x /= 10;
	}
	return n > INT_MAX || n < INT_MIN ? 0 : n;
}

