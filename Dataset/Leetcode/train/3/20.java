 class Solution {
 public int XXX(String s) {
        final char[] chars = s.toCharArray();
		List<Character> characters = new ArrayList<>();
		int max = 0;
		for (int i = 0; i < chars.length; i++) {
			characters.add(chars[i]);
			for (int j = i+1; j < chars.length; j++) {
				if(characters.contains(chars[j])){
					if (characters.size() > max) {
						max = characters.size();
					}
					break;
				}
				characters.add(chars[j]);
			}
			characters.clear();
		}
      return max;
    }
}

