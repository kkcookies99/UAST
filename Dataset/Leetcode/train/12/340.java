 public String XXX(int num) {

	char[] romanChars = new char[] {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
	
	StringBuilder sb = new StringBuilder();
	
	int index = 0;
	
	while (num > 0) {

		int res = num % 10;
		num = num / 10;
		
		while ((res < 4 && res > 0) || (res > 5 && res < 9)) {
			sb.insert(0, romanChars[index]);
			res--;
		}
		if (res == 5) {
			sb.insert(0, romanChars[index+1]);
		}
		if (res == 4) {
			sb.insert(0, romanChars[index+1]);
			sb.insert(0, romanChars[index]);
		}
		
		if (res == 9) {
			sb.insert(0, romanChars[index+2]);
			sb.insert(0, romanChars[index]);
		}
		index += 2;
	}
	
	
	return sb.toString();
}
