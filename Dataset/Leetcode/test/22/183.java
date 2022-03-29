 class Solution {
    public List<String> XXX(int n) {
        Set<String> set = new HashSet<>();
		List<String> temp = new ArrayList<>();
		if (n == 0) {
			return temp;
		}
		set.add("()");
		for (int i = 1; i < n; i++) {
			temp = new ArrayList<>(set);
			set.clear();
			for (String str : temp) {
				set.add("(" + str + ")");
				set.add("()" + str);
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == '(')
						set.add(str.substring(0, j+1) + "()" + str.substring(j + 1));
				}
			}
		}
		return new ArrayList<>(set);
    }
}

