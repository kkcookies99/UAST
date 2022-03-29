class Solution {
    public int XXX(int x) {
        long t = x;
	t = 0x5f3759df - (t >> 1);
	while (!(t*t <= x && (t+1)*(t+1) > x))
		t = (x/t + t)/2;
	return (int)t;
    }
}

