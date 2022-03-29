 class Solution {
    public int XXX(String s) {
        char[] c = { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };
	int[] n = { 1000, 500, 100, 50, 10, 5, 1 };
	char[] chs = s.toCharArray();
	int res = 0, cur = 0, pre = 0;
	for (int i = 0; i < chs.length; i++) {
		while (chs[i] != c[cur]) {
			cur = (cur + 1) % c.length;
		}
		res = n[pre] >= n[cur] ? res + n[cur] : res + n[cur] - (n[pre] * 2);
		pre = cur;
	}
	return res;
    }
}   

