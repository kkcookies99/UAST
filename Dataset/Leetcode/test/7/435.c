 int XXX(int x){
	int sym = 1;
	if (x < 0) sym = -1;

	int result = 0;
	if (x == -2147483648)
		return 0;
	x = x * sym;
	int rem = x % 10;
	do
	{
		if (result > 214748364 || (result == 214748364 && rem > 7))
			return 0;
		result = result * 10 + rem;
		x = x / 10;
		rem = x % 10;
	} while (x != 0);

	if (0 <= result <= 2147483647)
		return ((int)result*sym);

	return 0;
}

