class Solution {
    public int XXX(String s) {
        Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		char[] charArray = s.toCharArray();
		int result = map.get(charArray[charArray.length - 1]);
		int p;
		for (int i = charArray.length - 2; i >= 0; i--) {
			p = map.get(charArray[i]);
			if (p < map.get(charArray[i + 1])) {
				result -= p;
			} else {
				result += p;
			}
		}
		return result;
    }
}

