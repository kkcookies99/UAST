 public int XXX(String s) {
        s = s.trim();
		int count = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				count++;
			} else {
				return count;
			}
		}
		return count;
    }

