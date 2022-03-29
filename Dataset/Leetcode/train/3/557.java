 class Solution {
    public int XXX(String s) {
        int count = 0;
	Map<String, Integer> map = new HashMap<>();
	int left = 0;
	int right = 0;
	while (right < s.length()) {
		// 右侧的字符
		String ra = s.substring(right, right + 1);
		if (map.containsKey(ra)) {
			// 左侧的字符
			String la = s.substring(left, left + 1);
			map.remove(la);
			left++;
		} else {
			map.put(ra, 1);
			right++;
		}
		count = Math.max(count, right - left);
	}
	return count;
    }
}

