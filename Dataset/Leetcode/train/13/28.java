    public int XXX(String s) {
	Map<Character, Integer> luoMap = new HashMap<>();
    	luoMap.put('I',1);
    	luoMap.put('V',5);
    	luoMap.put('X',10);
    	luoMap.put('L',50);
    	luoMap.put('C',100);
    	luoMap.put('D',500);
    	luoMap.put('M',1000);
    	
    	char[] str = s.toCharArray();

    	int sum=0;
    	
    	for (int i = 0; i < str.length; i++) {		
		
    		//左边小于右边就减去，大于右边就加上
    		if( i+1<str.length &&  luoMap.get(str[i])<luoMap.get(str[i+1])) {
    			sum -= luoMap.get(str[i]);
			}else {
				sum += luoMap.get(str[i]);
			}
    	}
    	
		return sum;

