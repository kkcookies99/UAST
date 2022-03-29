 class Solution {
    public int XXX(String s) {
		int r = s.length() - 1;
		while (s.charAt(r) == ' ') {
			r--;
		}
		int temp = r;
		while (temp >= 0 && s.charAt(temp) != ' ') {
			temp--;
		}
		return r - temp ;
	}
}

