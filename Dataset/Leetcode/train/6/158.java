 public String XXX(String s, int numRows) {
       if(s.length()<numRows || s.length() < 3 || numRows < 2) {
			return s;
		}
		Map<Integer, StringBuilder> map = new HashMap<Integer, StringBuilder>();
		for(int i=1;i<=numRows;i++) {
			map.put(i, new StringBuilder());
		}
		int n = 1;
		boolean flag = true;
		for(int j=0;j<s.length();j++) {
			if(n==1) flag = true;
			if(n==numRows) flag = false;
			map.get(n).append(s.charAt(j));
			n = flag ? ++n : --n ;
		}
		
		Set<Integer> set = map.keySet();
		StringBuilder buffer = new StringBuilder();
		for (Integer integer : set) {
			buffer.append(map.get(integer));
		}
		return buffer.toString();
	}	 

