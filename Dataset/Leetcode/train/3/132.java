 class Solution {
  		int start = 0;
	
	public int XXX(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		char[] array = s.toCharArray();
		int[] dp = new int[array.length];
		dp[0] = 1;
		for (int i = 1; i < array.length; i++) {
			if (hasCommonChar(array, i)) {
				dp[i] = i - start;
			} else {
				dp[i] = dp[i - 1] + 1;
			}
		}

		int result = dp[0];
		for (int i = 1; i < dp.length; i++) {
			if (result < dp[i]) {
				result = dp[i];
			}
		}
		return result;

	}

	private boolean hasCommonChar(char[] array, int i) {

		boolean flag = false;
		
		for (int j = start; j < i; j++) {
			if (array[j] == array[i]) {
				flag = true;
				start = j;
			}
		}
		return flag;
	}
}

