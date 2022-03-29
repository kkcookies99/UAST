class Solution {
    public boolean XXX(int x) {
        if(x < 0)
        	return false;
        int x1 = 0;
        int x2 = x;
	while(x != 0)
	{
		x1 =  x1 * 10 + x % 10;
		x /= 10;
	}
	return x1 == x2;
    }
}

