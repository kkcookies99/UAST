 public int XXX(String s) {
        int n = s.length(), ans = 0, index = 0, i = 0, j = 0;
		while (i < n && j < n) {
			index = getindex(s.substring(i, j), s.charAt(j));
			if (index == -1) {
				j++;
				ans = Math.max(ans, j - i);
			} else
				i = index + i + 1;
		}
		return ans;
	}

	public static int getindex(String str, char s) {
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) == s)
				return i;
		return -1;
	}

