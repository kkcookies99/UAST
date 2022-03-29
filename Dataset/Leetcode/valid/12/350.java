 class Solution {
    public String XXX(int num) {
        StringBuilder re = new StringBuilder();
        HashMap<Integer,Character> map = new HashMap <>();
        map.put(1,'I');
        map.put(5,'V');
        map.put(10,'X');
        map.put(50,'L');
        map.put(100,'C');
        map.put(500,'D');
        map.put(1000,'M');
        
        if(map.containsKey(num)) return re.append(map.get(num)).toString();
        int check = 1000;
        while (check >=1) {
        	
        	
        	if(num / (check *5) == 1 && num /check != 9) {
        		re.append(map.get(check * 5));
        		num = num - check * 5;
        	}
        	
        	if(num / check == 4) {
        		re.append(map.get(check));
        		re.append(map.get(check * 5));
        	}else if(num / check == 9) {
        		re.append(map.get(check));
        		re.append(map.get(check *10));
        	
        	}else {
        		for(int i = 0; i< num / check ;i++) {
        			re.append(map.get(check));
        		}
        	}
        	
        	
        	num = num % check;
        	check /= 10;
        }
        
        
        return re.toString();
    }
}

