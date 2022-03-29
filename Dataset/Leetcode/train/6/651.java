 public String XXX(String s, int numRows) {
		if(s == null || "".equals(s)) {
			return "";
		}
		
		int length = s.length();
		int cycle = numRows + (numRows-2);
		if(cycle <= 0) {
			return s;
		}
		StringBuffer buffer = new StringBuffer();
		int gap = cycle;
		for(int i=0;i<numRows;i++) {
			int index = i;
			while(index < length) {
				buffer.append(s.charAt(index)); // 竖线所在列的字符拼接
				if(gap > 0 && gap%cycle != 0 && index+gap < length) { // 斜线所在列的拼接
					buffer.append(s.charAt(index+gap));
				}
				index += cycle;
			}
			gap -= 2;
		}
		
		return buffer.toString();
    }

