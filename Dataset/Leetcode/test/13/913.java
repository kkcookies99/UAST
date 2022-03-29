 public int XXX(String s) {
        HashMap<Character, Integer>map =  new HashMap<>();
		HashMap<String, Integer>map2 = new HashMap<>();
		int sum = 0;
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L',50);
		map.put('C', 100);
		map.put('D',500);
		map.put('M',1000);
		map2.put("IV",4);
		map2.put("IX",9);
		map2.put("XL",40);
		map2.put("XC",90);
		map2.put("CD",400);
		map2.put("CM",900);
		//遍历字符串,先取出特殊的字符
		for(String key:map2.keySet()) {
			String sub = "";
			String pattern = ".*"+key+".*";
			if(java.util.regex.Pattern.matches(pattern, s)) {
				sum+=map2.get(key);
				s=s.replaceAll(key, sub);
			}
		}
		for(int i=0;i<s.length();i++){
			char key = s.charAt(i);
			sum+=map.get(key);
		}
		return sum;
    }

