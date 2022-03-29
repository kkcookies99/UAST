class Solution {
    public boolean XXX(int x) {
        char c[] = String.valueOf(x).toCharArray();
        int len = c.length;
        for (int i = 0; i < len / 2; i++) {
	if(c[i] != c[len-1-i])
		return false;
        }
        return true;
    }
}

