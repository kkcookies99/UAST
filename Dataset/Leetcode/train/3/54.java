 class Solution {
    public int XXX(String s) {
     if (s.equals("")) {
			return 0;
		}
		if (s.equals(" ") || s.length() == 1) {
			return 1;
		}
		Set<Character> set = new HashSet<>();
		int left=0,max = 0,right=1;
		char[] chars = s.toCharArray();
		set.add(chars[0]);
		for (right = 1; right < chars.length; right++) {
			if (set.contains(chars[right])) {
				if(right-left > max){
					max = right-left;
				}
				set.remove(chars[left]);
				left++;
				right--;
				continue;
			}
			set.add(chars[right]);
		}
        if(right -left >max) max = right-left;
		return max == 0 ? right-left:max;
    }
}

