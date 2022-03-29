	public static int XXX(int x) {
		if (x < -Math.pow(2, 31) || x > Math.pow(2, 31) - 1) {
			return 0;
		}
		boolean isNegativeNumber = x < 0;
		String xStr = x + "";
		String newStr = "";
		int fromIndex = 0;
		if (isNegativeNumber) {
			fromIndex = 1;
		}
		for (int i = fromIndex; i < xStr.length(); i++) {
			newStr = xStr.substring(i, i + 1) + newStr;
		}
		try {
			if (isNegativeNumber) {
				return Integer.valueOf(-(Integer.valueOf(newStr)));
			}
			return Integer.valueOf(newStr);
		} catch (Exception e) {
			return 0;
		}
	}

