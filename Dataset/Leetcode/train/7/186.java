class Solution {
    public int XXX(int x) {
       long res = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            res = res * 10 + pop;
        }
        if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE) {
			return 0;
		}
        return (int)res;
    }
}

