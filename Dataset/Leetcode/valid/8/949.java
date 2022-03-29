 class Solution {
	public int XXX(String str) {
		if (str.equals("")) {
			return 0;
		}

		char[] arr = str.toCharArray();
		int result = 0;
		int i = 0;
		char c = 0;
		boolean flag = false;
		int ins = 0;

		for (; i < arr.length; i++) {
			c = arr[i];
			if (c == '-') {
				flag = true;
				i++;
				break;
			} else if (c == '+') {
				i++;
				break;
			} else if (c >= '0' && c <= '9') {
				break;
			} else if (c != ' ') {
				return 0;
			}
		}

		for (; i < arr.length; i++)

		{
			c = arr[i];
			if (c >= '0' && c <= '9') {
				ins = (int) (c - 48) * (flag ? -1 : 1);

				if (result < Integer.MIN_VALUE / 10)
					return Integer.MIN_VALUE;

				if (result > Integer.MAX_VALUE / 10) {
					return Integer.MAX_VALUE;
				}

				result *= 10;

				if (flag && result < Integer.MIN_VALUE - ins)
					return Integer.MIN_VALUE;

				if (!flag && result > Integer.MAX_VALUE - ins)
					return Integer.MAX_VALUE;

				result += ins;

			} else {
				break;
			}
		}

		return result;
	}
}


