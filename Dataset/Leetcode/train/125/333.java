 class Solution {
    public boolean XXX(String s) {
        // 正则+小写处理
        s = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
        if (s.length() == 0 || s.length() == 1) {
			return true;
		}
		int i = 0;
		int j = s.length() - 1;
		for (; i < s.length() / 2; ) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}
        // s处理后为长度为奇数，最后比较完之后 i == j ，偶数情况 i = j + 1
		return i >= j;
    }
}

