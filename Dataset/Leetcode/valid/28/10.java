 public static int XXX(String haystack, String needle) {
		if (needle.length() == 0)
			return 0;
		int left = 0, right = 0, index = 0;
		while (right < haystack.length() && index < needle.length()) {
			if (haystack.charAt(right) != needle.charAt(index)) {
				left++;
				right = left;
				index = 0;
			} else {
				right++;
				index++;
			}
		}
		return index == needle.length() ? left : -1;
	}

