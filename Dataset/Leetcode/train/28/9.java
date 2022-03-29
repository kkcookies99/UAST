 public int XXX(String haystack, String needle) {
		char[] main = haystack.toCharArray(), from = needle.toCharArray();
		for (int i = 0; i <= main.length - from.length; i++) {
			int j;
			for (j = 0; j < from.length; j++)
				if (main[i + j] != from[j])
					break;
			if (j == from.length)
				return i;
		}
		return -1;
	}

