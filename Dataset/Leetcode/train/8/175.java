class Solution {
    public int XXX(String s) {
        s = s.trim();
        String subNum = "";
	int startIndex = 0;
	if (s.startsWith("-") || s.startsWith("+")) {
		startIndex = 1;
	}
	for (int i = startIndex; i < s.length(); i++) {
		if (s.charAt(i) < '0' || s.charAt(i) > '9') {
			subNum = s.substring(startIndex, i);
			break;
		}
		if (subNum == "") {
			subNum = s.substring(startIndex);
		}
	}
	if (subNum.length() == 0) {
		return 0;
	}
	long result = 0;
	try {
		result = Long.parseLong(subNum);
		result = s.startsWith("-") ? result * -1 : result;
		if (result < (long)Math.pow(-2, 31)) {
			result = (long)Math.pow(-2, 31);
		}
		if (result > (long)Math.pow(2, 31)-1) {
			result = (long)Math.pow(2, 31)-1;
		}
	} catch (NumberFormatException e) {
		result = s.startsWith("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
	}
        return (int)result;
    }
}

