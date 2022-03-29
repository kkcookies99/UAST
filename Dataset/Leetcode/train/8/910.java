 class Solution {
    public int XXX(String str) {
        char[] c = str.toCharArray();
		int i = 0, n = c.length;
		for (i = 0; i < n; i++)
			if (c[i] != ' ')
				break;
		if (i == n)
			return 0;
		long rs = 0;
		boolean pos = !(c[i] == '-');
		if (c[i] == '+' || c[i] == '-')
			i++;
		for (; i < n; i++) {
			if (c[i] < 48 || c[i] > 57)
				break;
			rs = rs * 10 + c[i] - '0';
			if (rs > 0x7fffffff)
				return pos ? 0x7fffffff : 0x80000000;
		}
		return (int) (pos ? rs : -rs);
    }
}

