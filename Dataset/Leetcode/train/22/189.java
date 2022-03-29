 class Solution {
    public List<String> XXX(int n) {
		List<String> ans = new ArrayList<>();
		generateCore(ans, "", 0, 0, n);
		return ans;
	}

	private void generateCore(List<String> ans, String tmsAns, int left, int right, int len) {

		// 如果长度超过2*len 或者右括号比左括号多 则返回
		if (left + right > (len << 1) || right > left) {
			return;
		}
		// 左括号和右括号的长度相等且都达到了len
		if ((left ^ right) == 0 && (left ^ len) == 0)
			ans.add(tmsAns);

		// 右括号大于左括号时，不是合法的括号
		if (right <= left) {
			generateCore(ans, tmsAns + "(", left + 1, right, len);
			generateCore(ans, tmsAns + ")", left, right + 1, len);
		}

	}
}

