 public String XXX(String a, String b) {
		StringBuffer sb = new StringBuffer();
		int alen = a.length() - 1;
		int blen = b.length() - 1;
		int temp = 0;
		while (alen >= 0 || blen >= 0) {
			int sum = temp;
			if (alen >= 0)
				sum = sum + (a.charAt(alen--) - '0');
			if (blen >= 0)
				sum = sum + (b.charAt(blen--) - '0');
			sb.append(sum % 2);
			temp = sum / 2;
		}
		if (temp != 0) {
			sb.append(temp);
		}
		return sb.reverse().toString();
	}

