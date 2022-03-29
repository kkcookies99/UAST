public int XXX(String s) {
		int res = 0;
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		for(int i = 0; i < s.length(); i++) {
			int num1 = map.get(s.charAt(i));
			int num2 = (i + 1) < s.length()? map.get(s.charAt(i + 1)): 0;
			if(num1 >= num2) {
				res += num1;
			}else {
				res += (num2 - num1);
				i++;
			}
		}
		return res;
    }

