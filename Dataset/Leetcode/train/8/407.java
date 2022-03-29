 class Solution {
    public int XXX(String s) {
        // 是否正数
        boolean isPlus = true;
        // 去空格
	s = s.trim();
        // 合法性校验
	if(s == null || s.equals("")) return 0;
	int index = 0;
	if(s.charAt(0) == '+') {
		index++;
		if(s.length() == 1) return 0;
		if(s.charAt(1) < 48 || s.charAt(1) > 57) {
			return 0;
		}
	} else if(s.charAt(0) == '-') {
		isPlus = false;
		index++;
		if(s.length() == 1) return 0;
		if(s.charAt(1) < 48 || s.charAt(1) > 57) {
			return 0;
		}
	} else if(s.charAt(0) < 48 || s.charAt(0) > 57) {
		return 0;
	}
        // 得到数字长度
	for(;index < s.length(); index++) {
		if(s.charAt(index) < 48 || s.charAt(index) > 57) {
			break;
		}
	}
        // 转int
	s = s.substring(0, index);
	int result;
	try {
		result = Integer.parseInt(s);
	} catch(Exception e) {
		if(isPlus) return Integer.MAX_VALUE;
		else return Integer.MIN_VALUE;
	}
	return result;
    }
}

