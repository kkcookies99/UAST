public int getEdge(char[] chars, int i, int d) {
		while (i - d >= 0 && i + d < chars.length) {
			if (chars[i - d] != chars[i + d])
				return d - 1;
			d++;
		}
		return d - 1;
	}

	public String XXX(String s) {
		// 插入#
		StringBuilder sb = new StringBuilder();
		char[] chars = s.toCharArray();
		for (char c : chars) {
			sb.append("#");
			sb.append(c);
		}
		sb.append("#");
		s = sb.toString();

		int R = -1;
		int C = 0;
		int[] len = new int[s.length()];

		chars = s.toCharArray();
		int res = 0;
		int maxC = 0;
		for (int i = 0; i < chars.length; i++) {
			if (i > R) {
				int d = getEdge(chars, i, 0);
				R = i + d;
				C = i;
				len[i] = d;
				if (d > res) {
					res = d;
					maxC = i;
				}
			} else {
				int iHat = C - (i - C);
				int L = C - (R - C);
				if (iHat - len[iHat] < L || iHat - len[iHat] > L) {
					len[i] = Math.min(R - i, len[iHat]);
				} else {
					int d = getEdge(chars, i, R - i);
					if (d > res) {
						res = d;
						maxC = i;
					}
					if (i + d > R) {
						R = i + d;
						C = i;
					}
					len[i] = d;
				}
			}
		}
		return s.substring(maxC - len[maxC], maxC + len[maxC] + 1).replace("#", "");
	}


